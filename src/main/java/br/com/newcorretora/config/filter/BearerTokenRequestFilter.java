/**
 * 
 */
package br.com.newcorretora.config.filter;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

/**
 * Filtro para validação de token
 * 
 * @author Fabio Iwakoshi
 *
 */
@Provider
@PreMatching
@Priority(Priorities.AUTHENTICATION)
public class BearerTokenRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

	}
}
