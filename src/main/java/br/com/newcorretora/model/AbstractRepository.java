/**
 * 
 */
package br.com.newcorretora.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * @author Fabio Iwakoshi
 *
 */
public abstract class AbstractRepository<E extends IEntity<K>, K extends Serializable> {

	@Inject
	private EntityManager entityManager;
	
	@Inject
	private Logger log;
	
	private Class<E> entityType;
	
	private String[] fieldsAK;

	/**
	 * By defining this class as abstract, we prevent Spring from creating
	 * instance of this class If not defined as abstract,
	 * getClass().getGenericSuperClass() would return Object. There would be
	 * exception because Object class does not hava constructor with parameters.
	 */
	@SuppressWarnings("unchecked")
	public AbstractRepository() {
		Type type = getClass().getGenericSuperclass();

        while (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != AbstractRepository.class) {
            if (type instanceof ParameterizedType) {
                type = ((Class<?>) ((ParameterizedType) type).getRawType()).getGenericSuperclass();
            } else {
                type = ((Class<?>) type).getGenericSuperclass();
            }
        }

        this.entityType = (Class<E>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}

	public List<E> findAll() {
		return entityManager.createNamedQuery(entityType.getSimpleName() + ".findAll", entityType).getResultList();
	}

	public E findById(K key) {
		return entityManager.find(entityType, key);
	}

	public E save(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	public E update(E entity) {
		return entityManager.merge(entity);
	}

	public E delete(E entity) {
		entityManager.remove(entity);
		return entity;
	}

	public boolean notFindByAKs(E entity) {
		TypedQuery<E> typedQuery = entityManager.createNamedQuery(entityType.getSimpleName() + ".findByAKs", entityType);
		
		if(fieldsAK != null) {
			Class<?> clazzOrigem = entity.getClass();
			for (String ak : fieldsAK) {
				try {
					Field field = clazzOrigem.getDeclaredField(ak);
					field.setAccessible(true);
					typedQuery.setParameter(ak, field.get(entity));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException e) {
					log.log(Level.SEVERE, "Erro ao pesquisar Chaves Alternativas!", e);
					throw new IllegalArgumentException("Erro ao pesquisar Chaves Alternativas!");
				}
			}
		}
		
		return typedQuery.setMaxResults(1).getResultList().isEmpty();
	}

	public List<E> findByReferencia(K key) {
		return entityManager.createNamedQuery(entityType.getSimpleName() + ".findByReferencia", entityType)
				.setParameter(entityType.getSimpleName().substring(0, 1).toLowerCase()+entityType.getSimpleName().substring(1), key)
				.setMaxResults(1).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param fieldsAK the fieldsAK to set
	 */
	public void setFieldsAK(String[] fieldsAK) {
		this.fieldsAK = fieldsAK;
	}
}
