package br.com.newcorretora.resource;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.soap.SOAPException;

import br.com.newcorretora.model.vo.TransacaoVO;
import br.com.newcorretora.service.TransacaoService;

@Path("solicitacao-transacao")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransacaoResource {

	@Inject
	private TransacaoService transacaoService;
	
	@POST
	@Path("send")
	public Response send(@Valid TransacaoVO transacao, @Context UriInfo uriInfo) {
		try {
			transacaoService.send(transacao);
		} catch (SOAPException | IOException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
}
