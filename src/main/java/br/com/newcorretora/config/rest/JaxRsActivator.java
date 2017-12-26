package br.com.newcorretora.config.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * A classe estende {@link Application} e é anotada com @ApplicationPath não
 * sendo necessário informar no arquivo web.xml a ativação do JAX-RS.
 * 
 * <p>
 * Os Resources terão como prefixo o valor informado na anotação {@link ApplicationPath}.
 * </p>
 */
@ApplicationPath("/api")
public class JaxRsActivator extends Application {
	/* classe intencionalmente deixada em branco */
}
