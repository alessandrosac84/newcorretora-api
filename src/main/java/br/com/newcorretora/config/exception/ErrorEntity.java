/**
 * 
 */
package br.com.newcorretora.config.exception;

import java.io.Serializable;

/**
 * Classe de retorno das informações de erro.
 * 
 * @author Fabio Iwakoshi
 *
 */
public class ErrorEntity implements Serializable {

	private static final long serialVersionUID = 7458818623966405746L;
	
	private int status;
	
	private int code;
	
	private String message;
	
	private String link;

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public ErrorEntity status(int status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public ErrorEntity code(int code) {
		this.code = code;
		return this;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public ErrorEntity message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public ErrorEntity link(String link) {
		this.link = link;
		return this;
	}	

}
