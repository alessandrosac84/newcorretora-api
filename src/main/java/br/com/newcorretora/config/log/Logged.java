/**
 * 
 */
package br.com.newcorretora.config.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * Interface de marcação para Classes ou Métodos que devem logar informações.
 * 
 * @author Fabio IWakoshi
 *
 */
@InterceptorBinding
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Logged {

}
