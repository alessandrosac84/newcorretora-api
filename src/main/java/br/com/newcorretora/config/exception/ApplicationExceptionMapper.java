package br.com.newcorretora.config.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Fabio IWakoshi
 *
 */
@Provider
public class ApplicationExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		if (exception instanceof WebApplicationException) {
			return responseBuilder((WebApplicationException) exception);
		}
		return null;
	}

	private Response responseBuilder(WebApplicationException exception) {
		exception.getResponse().getStatus();
		ErrorEntity entity = new ErrorEntity().status(exception.getResponse().getStatus()).code(0)
				.message(exception.getMessage()).link("api/page-codes");

		ResponseBuilder builder = Response.status(exception.getResponse().getStatus()).entity(entity);
		builder.type(MediaType.APPLICATION_JSON);
		return builder.build();
	}

}
