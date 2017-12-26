package br.com.newcorretora.config.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.ext.Provider;

/**
 * Filtro para validação de token
 * 
 * @author Fabio Iwakoshi
 *
 */
@Provider
public class CacheControlFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		if (requestContext.getMethod().equals("GET")) {
			CacheControl cc = new CacheControl();
			cc.setMaxAge(100);
			responseContext.getHeaders().add("Cache-Control", cc);
		}
	}

}
