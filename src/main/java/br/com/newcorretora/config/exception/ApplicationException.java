package br.com.newcorretora.config.exception;

import javax.ws.rs.core.Response.Status;

public class ApplicationException extends RuntimeException {

	/** * */
	private static final long serialVersionUID = 2450856312656842622L;
	private Status status;

	public ApplicationException(String message, Status status) {
		super(message);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
