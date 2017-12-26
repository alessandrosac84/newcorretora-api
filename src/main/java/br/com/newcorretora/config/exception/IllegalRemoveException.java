package br.com.newcorretora.config.exception;

import javax.ws.rs.core.Response.Status;

public class IllegalRemoveException extends ApplicationException {

	/** * */
	private static final long serialVersionUID = 1L;

	public IllegalRemoveException(String message) {
		super(message, Status.BAD_REQUEST);
	}
}
