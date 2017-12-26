/**
 * 
 */
package br.com.newcorretora.config.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * Filtro para cross domain
 * 
 * @author Fabio Iwakoshi
 *
 */
@Provider
public class CrossDomainResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		Logger log = Logger.getLogger(CrossDomainResponseFilter.class.getName());
		log.fine(() -> "Executando CrossDomain Response Filter... ");
		
		responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		responseContext.getHeaders().add("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE");
		responseContext.getHeaders().add("Access-Control-Allow-Headers", "Content-Type, Accept");
		
	}

}
