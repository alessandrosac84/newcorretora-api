/**
 * 
 */
package br.com.newcorretora.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import br.com.newcorretora.config.exception.NotChangeException;
import br.com.newcorretora.model.AuditedEntity;
import br.com.newcorretora.model.IEntity;
import br.com.newcorretora.service.AbstractService;

/**
 * Classe de Utilizades
 * 
 * @author Fabio IWakoshi
 *
 */
public class Util {
	
	private static Logger log = Logger.getAnonymousLogger();
	
	private Util() { }

	/**
	 * Método responsavel por padronizar o retorno de paginações.
	 * 
	 * O Header Content-Range é inserido na resposta.
	 * 
	 * @param service
	 * @param lista
	 * @param offset
	 * @param limit
	 * @return Response
	 */
	public static Response paginacao(Long count, List<?> lista, int offset, int limit) {
		String range = String.format("rows %d-%d/%d", offset * limit, offset * limit + lista.size(), count);
		if (lista.size() < limit) {
			// Não existem mais registros para retornar
			return Response.ok(lista).header("Content-Range", range).build();
		} else {
			// Existem mais registros a serem recuperados
			return Response.status(Response.Status.PARTIAL_CONTENT).entity(lista).header("Content-Range", range)
					.build();
		}
	}
	
	public static boolean isChanged(Collection<?> origem, Collection<?> destino) {
		if (checkNull(origem, destino) != null) {
			return checkNull(origem, destino);
		}
		return !containsAll(origem, destino);
	}
	
	private static Boolean checkNull(Object origem, Object destino) {
		if (origem == null && destino == null) {
			return false;
		} else if (origem != null && destino == null) {
			return true;
		} else if (origem == null) {
			return true;
		}
		return null;
	}

	private static boolean containsAll(Collection<?> origem, Collection<?> destino) {
		if (origem.size() != destino.size()) {
			return false;
		}

		for (Object o : origem) {
			boolean found = false;
			for (Object d : destino) {
				if (o.equals(d)) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}

		return true;
	}

	public static boolean isChanged(Object origem, Object destino, String... ignoredfields) {
		if (checkNull(origem, destino) != null) {
			return checkNull(origem, destino);
		}

		if (origem.getClass() != destino.getClass()) {
			log.log(Level.SEVERE, () -> "Objetos são de tipos diferentes");
			return false;
		}

		Class<?> clazzOrigem = origem.getClass();
		List<String> fields = new ArrayList<>(Arrays.asList(ignoredfields));
		fields.add("serialVersionUID");
		fields.add("id");
		fields.add("timestampInclusao");
		fields.add("timestampAlteracao");
		fields.add("usuarioInclusao");
		fields.add("usuarioAlteracao");
		for (Field field : clazzOrigem.getDeclaredFields()) {
			try {
				field.setAccessible(true);
				if (!fields.contains(field.getName())) {
					if ((field.get(origem) == null && field.get(destino) != null)
							|| (field.get(origem) != null && field.get(destino) == null)) {
						return true;
					}
					if (isPrimitiveWrapper(field.getType())) {
						if (!field.get(destino).equals(field.get(origem))) {
							return true;
						}
					} else if (field.getType() == String.class) {
						if (isChanged((String) field.get(origem), (String) field.get(destino))) {
							return true;
						}
					} else if (field.getType() == Calendar.class) {
						if (isChanged((Calendar) field.get(origem), (Calendar) field.get(destino))) {
							return true;
						}
					} else if (field.getType() == Date.class) {
						if (isChanged((Date) field.get(origem), (Date) field.get(destino))) {
							return true;
						}
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException | SecurityException e) {
				log.log(Level.SEVERE, e, () -> "Erro ao verificar igualdade dos objetos");
				return false;
			}
		}
		return false;
	}

	public static boolean isChanged(Date origem, Date destino) {
		if (checkNull(origem, destino) != null) {
			return checkNull(origem, destino);
		}
		return destino.getTime() != origem.getTime();
	}

	public static boolean isChanged(Calendar origem, Calendar destino) {
		if (checkNull(origem, destino) != null) {
			return checkNull(origem, destino);
		}
		return origem.getTimeInMillis() != destino.getTimeInMillis();
	}

	public static boolean isChanged(String origem, String destino) {
		if (checkNull(origem, destino) != null) {
			return checkNull(origem, destino);
		}
		return !origem.equals(destino);
	}

	private static boolean isPrimitiveWrapper(Class<?> type) {
		if (type.isPrimitive()) {
			return true;
		}
		return type == Byte.class || type == Short.class || type == Integer.class || type == Long.class
				|| type == Float.class || type == Double.class || type == Boolean.class || type == Character.class;
	}

	public static <E> E cleanFieldEntity(E entity, String campo, Object valor) throws Exception {
		Class<?> clazzEntity = entity.getClass();

		try {
			Field field = clazzEntity.getDeclaredField(campo);
			field.setAccessible(true);
			field.set(entity, valor);
		} catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e) {
			log.log(Level.SEVERE, e, () -> "Erro ao limpar valores da entidade");
			throw e;
		}
		return entity;
	}

	public static AuditedEntity fixEntity(AuditedEntity entity) {
		Class<?> clazzEntity = entity.getClass();
		for (Field field : clazzEntity.getDeclaredFields()) {
			try {
				field.setAccessible(true);
				if (field.getType() == Set.class || field.getType() == List.class) {
					field.set(entity, null);
				}
			} catch (IllegalArgumentException | SecurityException | IllegalAccessException e) {
				log.log(Level.SEVERE, e, () -> "Erro ao limpar valores da entidade");
			}
		}
		return entity;
	}

	public static <E extends IEntity<K>, K extends Serializable> void updateList(AbstractService<E, K> service,
			Set<E> currentList, Set<E> newList) {
		if (newList == null || newList.isEmpty()) {
			for (E currentObject : currentList) {
				service.delete(currentObject);
			}
			return;
		}

		// verificar se todos os registros existem na tabela current. Os que não forem
		// encontrados serão adicionados na lista ou removidos
		if (!containsAll(newList, currentList)) {
			for (E currentObject : currentList) {
				boolean found = false;
				for (E newObject : newList) {
					if (currentObject.isTheSameObject(newObject)) {
						found = true;
						break;
					}
				}
				if (!found) {
					service.delete(currentObject);
				}
			}
		}
		if (!containsAll(currentList, newList)) {
			for (E newObject : newList) {
				boolean found = false;
				for (E currentObject : currentList) {
					if (currentObject.isTheSameObject(newObject)) {
						found = true;
						if (isChanged(currentObject, newObject)) {
							try {
								service.update(newObject);
							} catch (NotChangeException e) {
								continue;
							}
						}
						break;
					}
				}
				if (!found) {
					service.save(newObject);
				}
			}
		}
	}

	public static <E extends IEntity<K>, K extends Serializable> void updateList(AbstractService<E, K> service,
			Set<E> currentList, E newObject) {
		// verificar se todos os registros existem na tabela current. Os que não forem
		// encontrados serão adicionados na lista ou removidos
		E found = null;
		for (E currentObject : currentList) {
			if (currentObject.isTheSameObject(newObject)) {
				found = currentObject;
				break;
			}
		}
		if (found == null) {
			service.save(newObject);
		} else {
			if (isChanged(found, newObject)) {
				service.update(newObject);
			}
		}
	}

	public static void copyProperties(Object origin, Object target, String... ignoredfields) {
		List<String> fields = new ArrayList<>(Arrays.asList(ignoredfields));
		fields.add("serialVersionUID");
		fields.add("timestampInclusao");
		fields.add("timestampAlteracao");
		fields.add("usuarioInclusao");
		fields.add("usuarioAlteracao");

		for (Field field : target.getClass().getDeclaredFields()) {
			try {
				field.setAccessible(true);
				if (!fields.contains(field.getName())) {
					field.set(target, field.get(origin));
				}
			} catch (IllegalArgumentException | IllegalAccessException | SecurityException e) {
				log.log(Level.SEVERE, e, () -> "Erro ao copiar propriedades");
			}
		}
	}

	public static void copyOnlyProperties(Object origin, Object target, String[] updatableFields) {
		List<String> fields = new ArrayList<>(Arrays.asList(updatableFields));
		for (Field field : target.getClass().getDeclaredFields()) {
			try {
				field.setAccessible(true);
				if (fields.contains(field.getName())) {
					field.set(target, field.get(origin));
				}
			} catch (IllegalArgumentException | IllegalAccessException | SecurityException e) {
				log.log(Level.SEVERE, e, () -> "Erro ao copiar propriedades");
			}
		}
	}
}
