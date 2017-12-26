/**
 * 
 */
package br.com.newcorretora.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade Parameter.
 * 
 * @author Fabio Iwakoshi
 *
 */
@Entity
@Table(name = "parameter")
public class Parameter implements Serializable {

	private static final long serialVersionUID = 5575858173668571090L;

	@Id
	@Enumerated(EnumType.STRING)
	private Environment environment;

	@Column(name = "new_corretora_host")
	private String newCorretoraHost;
	
	@Column(name = "new_corretora_authorization")
	private String newCorretoraAuthorization;

	/**
	 * @return the environment
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	/**
	 * @return the newCorretoraHost
	 */
	public String getNewCorretoraHost() {
		return newCorretoraHost;
	}

	/**
	 * @param newCorretoraHost the newCorretoraHost to set
	 */
	public void setNewCorretoraHost(String newCorretoraHost) {
		this.newCorretoraHost = newCorretoraHost;
	}

	/**
	 * @return the newCorretoraAuthorization
	 */
	public String getNewCorretoraAuthorization() {
		return newCorretoraAuthorization;
	}

	/**
	 * @param newCorretoraAuthorization the newCorretoraAuthorization to set
	 */
	public void setNewCorretoraAuthorization(String newCorretoraAuthorization) {
		this.newCorretoraAuthorization = newCorretoraAuthorization;
	}
}
