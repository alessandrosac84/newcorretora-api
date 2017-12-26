//package br.com.newcorretora.service;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//import javax.xml.soap.SOAPException;
//
//import br.com.newcorretora.model.vo.TransacaoVO;
//import br.com.newcorretora.service.geraws.SUDPOMSGPort;
//import br.com.newcorretora.service.geraws.SUDPOMSGService;
//import br.com.newcorretora.service.geraws.request.ProgramInterface;
//import br.com.newcorretora.service.geraws.request.ProgramInterface.WebSudwsmsg;
//
//@Stateless
//public class TransacaoService {
//
//	@Inject
//	private Logger log;
//	
//	public void send(TransacaoVO servico) throws SOAPException, IOException {
//		ProgramInterface request = new ProgramInterface();
//		request.setWebSudwsmsg(new WebSudwsmsg());
//		br.com.newcorretora.service.geraws.response.ProgramInterface response = new br.com.newcorretora.service.geraws.response.ProgramInterface(); 
//		
//		request.getWebSudwsmsg().setWebPgmname("RANBBNTG");
//		//request.getWebSudwsmsg().setWebPgmname(servico.getPrograma());
//		request.getWebSudwsmsg().setWebUri("http://CICSWEB.DES.CAIXA:32584/tokensmst");
//		//request.getWebSudwsmsg().setWebUri(servico.getUri());
//		request.getWebSudwsmsg().setWebTransaction("SUWB");
//		//request.getWebSudwsmsg().setWebTransaction(servico.getSistemaId());
//		request.getWebSudwsmsg().setWebPgmintContainerCommarea("COMMAREA");
//		//request.getWebSudwsmsg().setWebPgmintContainerCommarea(servico.getFlag());
//		request.getWebSudwsmsg().setWebReqmemBookEntrada("SUDWSWEB");
//		//request.getWebSudwsmsg().setWebReqmemBookEntrada(servico.getBookEntrada());
//		request.getWebSudwsmsg().setWebRespmemBookSaida("SUDWSWEB");
//		//request.getWebSudwsmsg().setWebRespmemBookSaida(servico.getBookSaida());
//		request.getWebSudwsmsg().setWebPdslibBook("END.SPD.TESTE.BOOK");
//		//request.getWebSudwsmsg().setWebPdslibBook(servico.getDiretorioEntrada());
//		
//		request.getWebSudwsmsg().setWebUsuarioTmpdirUsuserv("SSUDS01D");
//		request.getWebSudwsmsg().setWebResquestNamespace("/tokensmst");
//		request.getWebSudwsmsg().setWebResponseNamespace("tokensms");
//		request.getWebSudwsmsg().setWebLang("COBOL");
//		request.getWebSudwsmsg().setWebWsbind("tokensmst.wsbind");
//		request.getWebSudwsmsg().setWebWsdl("tokensmst.wsdl");
//		request.getWebSudwsmsg().setWebWsdlNamespaceHttp("tokensms");
//		request.getWebSudwsmsg().setWebOperationName("getToken");
//		request.getWebSudwsmsg().setWebUserid("SMBSSUDD");
//		request.getWebSudwsmsg().setWebMsgRetorno("");
//		request.getWebSudwsmsg().setWebSequenciaControle(163733);
//		request.getWebSudwsmsg().setWebSubmitStatus("S");
//		
//        log.info("Create Web Service Client...");
//        SUDPOMSGService service1 = new SUDPOMSGService();
//        log.info("Create Web Service...");
//        SUDPOMSGPort port1 = service1.getSUDPOMSGPort();
//        log.info("Call Web Service Operation...");
//        response.setWebSudwsmsg(port1.geraws(request.getWebSudwsmsg()));
//        log.info("View Response ...");
//        log.info(response.getWebSudwsmsg().getWebMsgRetorno());
//
//    }
//
//}
