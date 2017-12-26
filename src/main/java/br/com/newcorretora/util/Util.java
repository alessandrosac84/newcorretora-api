/**
 * 
 */
package br.com.newcorretora.util;

import java.util.List;

import javax.ws.rs.core.Response;

/**
 * Classe de Utilizades
 * 
 * @author Fabio IWakoshi
 *
 */
public class Util {
	
	private Util() { }

	/**
	 * Método responsavel por padronizar o retorno de paginações.
	 * 
	 * O Header Content-Range é inserido na resposta.
	 * 
	 * @param service
	 * @param lista
	 * @param offset
	 * @param limit
	 * @return Response
	 */
	public static Response paginacao(Long count, List<?> lista, int offset, int limit) {
		String range = String.format("rows %d-%d/%d", offset * limit, offset * limit + lista.size(), count);
		if (lista.size() < limit) {
			// Não existem mais registros para retornar
			return Response.ok(lista).header("Content-Range", range).build();
		} else {
			// Existem mais registros a serem recuperados
			return Response.status(Response.Status.PARTIAL_CONTENT).entity(lista).header("Content-Range", range)
					.build();
		}
	}
}
