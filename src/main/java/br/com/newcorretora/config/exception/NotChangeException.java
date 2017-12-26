package br.com.newcorretora.config.exception;

import javax.ws.rs.core.Response.Status;

public class NotChangeException extends ApplicationException {

	/** * */
	private static final long serialVersionUID = 5447918803309645239L;

	public NotChangeException(String message) {
		super(message, Status.BAD_REQUEST);
	}
}
