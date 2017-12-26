package br.com.newcorretora.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;

import br.com.newcorretora.config.exception.IllegalRemoveException;
import br.com.newcorretora.config.exception.NotChangeException;
import br.com.newcorretora.model.AbstractRepository;
import br.com.newcorretora.model.IEntity;
import br.com.newcorretora.util.Messages;
import br.com.newcorretora.util.Util;

/**
 * @author Fabio Iwakoshi
 *
 */
public abstract class AbstractService<E extends IEntity<K>, K extends Serializable> {

	@Inject
	private Logger log;

	@Inject
	private ResourceBundle bundle;
	
	private AbstractRepository<E, K> repository;

	private Class<E> entityType;
	
	private String[] updatableFields;
	
	@SuppressWarnings("unchecked")
	public AbstractService() {
		Type type = getClass().getGenericSuperclass();

        while (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != AbstractService.class) {
            if (type instanceof ParameterizedType) {
                type = ((Class<?>) ((ParameterizedType) type).getRawType()).getGenericSuperclass();
            } else {
                type = ((Class<?>) type).getGenericSuperclass();
            }
        }

        this.entityType = (Class<E>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}
	
	@PostConstruct
	public abstract void init();
	
	public List<E> findAll() {
		log.fine("Listing All " + entityType.getSimpleName() + " ::");
		return repository.findAll();
	}
	
	public E findById(K key) {
		log.fine("Finding " + entityType.getSimpleName() + " by Id " + key + " ::");
		return repository.findById(key);
	}
	
	public E save(@Valid E entity) {
		log.fine("Saving " + entityType.getSimpleName() + " ::");
		if (notFindByAKs(entity)) {
			return repository.save(entity);
		}
		throw new BadRequestException(bundle.getString(Messages.RECURSO_EXISTENTE),
				new Exception());
	}

	public E update(@Valid E entity) {
		log.fine("Updating " + entityType.getSimpleName() + " ::");

		E current = findById(entity.getId());
		
		if (!notFindByAKs(entity)) {
			throw new BadRequestException(bundle.getString(Messages.RECURSO_EXISTENTE),
					new Exception());
		}

		if (current != null) {
			if (Util.isChanged(current, entity)) {
				if (updatableFields != null) {
					Util.copyOnlyProperties(entity, current, updatableFields);
				} else {
					Util.copyProperties(entity, current);
				}
				return repository.update(current);
			}
			throw new NotChangeException(bundle.getString(Messages.RECURSO_SEM_ALTERACOES));
		}
		throw new NotFoundException(bundle.getString(Messages.RECURSO_NAO_ENCONTRADO),
				new Exception());
	}

	public E deleteById(K key) {
		log.fine("Deleting " + entityType.getSimpleName() + " by Id " + key + " ::");
		if (findById(key) != null) {
			return delete(findById(key));
		}
		throw new NotFoundException(bundle.getString(Messages.RECURSO_NAO_ENCONTRADO),
				new Exception());
	}

	public E delete(@Valid E entity) {
		log.fine("Deleting " + entityType.getSimpleName() + " ::");
		if (findByReferencia(entity.getId()).isEmpty()) {
			return repository.delete(entity);
		}
		throw new IllegalRemoveException(bundle.getString(Messages.RECURSO_NAO_PODE_SER_REMOVIDO));
	}
	
	protected boolean notFindByAKs(@Valid E entity) {
		log.fine("Finding " + entityType.getSimpleName() + " By AKs ::");
		return repository.notFindByAKs(entity);
	}

	public List<E> findByReferencia(K key) {
		log.fine("Finding " + entityType.getSimpleName() + " by Referencia ::");
		return repository.findByReferencia(key);
	}

	public void setRepository(AbstractRepository<E, K> repository) {
		this.repository = repository;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return log;
	}

	/**
	 * @return the bundle
	 */
	public ResourceBundle getBundle() {
		return bundle;
	}

	/**
	 * @param updatableFields the updatableFields to set
	 */
	public void setUpdatableFields(String[] updatableFields) {
		this.updatableFields = updatableFields;
	}
}
