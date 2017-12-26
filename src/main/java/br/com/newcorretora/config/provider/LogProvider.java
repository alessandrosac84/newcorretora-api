/**
 * 
 */
package br.com.newcorretora.config.provider;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Classe responsável pela criação do Logger para ser injetado atravéz do CDI.
 * 
 * @author Fabio Iwakoshi
 *
 */
public class LogProvider {
	@Produces
	public Logger produceLog(InjectionPoint injectionPoint) {
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
}
