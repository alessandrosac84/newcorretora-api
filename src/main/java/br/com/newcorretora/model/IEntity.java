/**
 * 
 */
package br.com.newcorretora.model;

import java.io.Serializable;

/**
 * @author Fabio Iwakoshi
 *
 */
public interface IEntity<K extends Serializable> {

	public K getId();
	
	public boolean isTheSameObject(IEntity<K> object);
}
