/**
 * 
 */
package br.com.newcorretora.config.log;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Classe responsável por interceptar métodos das classes que possuem a
 * interface @Logged .
 * 
 * @author Fabio Iwakoshi
 *
 */
@Logged
@Interceptor
public class LoggerInterceptor {

	@Inject
	private Logger log;

	@AroundInvoke
	public Object intercept(InvocationContext ic) throws Exception {
		// TODO obter usuario logado
		log.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
		log.log(Level.INFO, ">>> user {0} invoced the method {1}.{2}({3})",
				new Object[] { "Anonimous", ic.getTarget().getClass().getName(), ic.getMethod().getName(),
						Arrays.deepToString(ic.getParameters()) });
		try {
			return ic.proceed();
		} finally {
			log.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
			log.info(() -> "<<< " + ic.getTarget().getClass().getName() + "-" + ic.getMethod().getName());
		}
	}
}
