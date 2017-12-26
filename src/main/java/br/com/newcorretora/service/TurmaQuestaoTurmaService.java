//package br.com.newcorretora.service;
//
//import java.util.Calendar;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//import javax.ws.rs.NotFoundException;
//
//import br.gov.caixa.sharepoint.config.log.Logged;
//import br.gov.caixa.sharepoint.config.security.subject.PrincipalThreadLocal;
//import br.gov.caixa.sharepoint.model.entity.Funcionario;
//import br.gov.caixa.sharepoint.model.entity.Notificacao;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoOpcaoResposta;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoOpcaoRespostaPK;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoResposta;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoRespostaPK;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoTurma;
//import br.gov.caixa.sharepoint.model.entity.TurmaQuestaoTurmaPK;
//import br.gov.caixa.sharepoint.model.repository.FuncionarioRepository;
//import br.gov.caixa.sharepoint.model.repository.NotificacaoRepository;
//import br.gov.caixa.sharepoint.model.repository.TurmaQuestaoOpcaoRespostaRepository;
//import br.gov.caixa.sharepoint.model.repository.TurmaQuestaoRespostaRepository;
//import br.gov.caixa.sharepoint.model.repository.TurmaQuestaoTurmaRepository;
//import br.gov.caixa.sharepoint.util.Messages;
//
///**
// * @author Alessandro Carvalho
// *
// */
//@Logged
//@Stateless
//public class TurmaQuestaoTurmaService extends AbstractService<TurmaQuestaoTurma, TurmaQuestaoTurmaPK>{
//	
//	@Inject
//	private TurmaQuestaoTurmaRepository turmaQuestaoTurmaRepository;
//
//	@Inject
//	private FuncionarioRepository funcionarioRepository;
//	
//	@Inject
//	private TurmaQuestaoRespostaRepository turmaQuestaoRespostaRepository;
//	
//	@Inject
//	private TurmaQuestaoOpcaoRespostaRepository turmaQuestaoOpcaoRespostaRepository;
//	
//	@Inject
//	private NotificacaoRepository notificacaoRepository;
//	
//	@Override
//	@PostConstruct
//	public void init() {
//		setRepository(turmaQuestaoTurmaRepository);
//	}
//	
//	public List<TurmaQuestaoTurma> findQuestoaoByTurma(String treinamento, Integer turma) {
//		getLog().fine("Finding Questoes By Turma ::");
//		
//		if (turma != null) {
//			return turmaQuestaoTurmaRepository.findByTurma(turma);
//		}
//		throw new NotFoundException(getBundle().getString(Messages.RECURSO_NAO_ENCONTRADO),
//				new Exception());
//	}
//	
//	public List<TurmaQuestaoTurma> findQuestoesRespostaByTurma(String treinamento, Integer turma) {
//		getLog().fine("Finding Questoes Resposta By Turma ::");
//
//		if (turma != null) {
//			return turmaQuestaoTurmaRepository.findQuestoesRespostaByTurma(turma);
//		}
//		throw new NotFoundException(getBundle().getString(Messages.RECURSO_NAO_ENCONTRADO),
//				new Exception());
//	}
//
//	public Notificacao saveTurmaQuestoes(List<TurmaQuestaoResposta> turmaQuestoes) {
//		getLog().fine("Insert TurmaQuestaoTurmaResposta By Turma ::");
//		
//		Funcionario funcionarioAtual = funcionarioRepository.findById(PrincipalThreadLocal.USER.get().getUsername());
//		TurmaQuestaoTurma turmaQuestaoTurma = turmaQuestaoTurmaRepository.findByTurmaQuestao(turmaQuestoes.get(0).getId().getTurmaQuestao());
//		
//		for (int i = 0; i < turmaQuestoes.size(); i++) {
//			TurmaQuestaoResposta turmaQuestaoResposta = new TurmaQuestaoResposta();
//			TurmaQuestaoRespostaPK turmaQuestaoRespostaPK = new TurmaQuestaoRespostaPK();
//			turmaQuestaoRespostaPK.setFuncionario(PrincipalThreadLocal.USER.get().getUsername());
//			turmaQuestaoRespostaPK.setTurmaQuestao(turmaQuestoes.get(i).getId().getTurmaQuestao());
//			
//			turmaQuestaoResposta.setId(turmaQuestaoRespostaPK);
//			turmaQuestaoResposta.setFuncionario(funcionarioAtual);
//			turmaQuestaoResposta.setJustificativa(turmaQuestoes.get(i).getJustificativa());
//			
//			turmaQuestaoRespostaRepository.save(turmaQuestaoResposta);
//			
//			if(turmaQuestoes.get(i).getTurmaQuestaoOpcaoRespostas() != null && turmaQuestoes.get(i).getTurmaQuestaoOpcaoRespostas().size() > 0){
//				
//				for (TurmaQuestaoOpcaoResposta turmaQuestaoOpcaoResposta : turmaQuestoes.get(i).getTurmaQuestaoOpcaoRespostas()) {
//					TurmaQuestaoOpcaoResposta item = new TurmaQuestaoOpcaoResposta();
//					TurmaQuestaoOpcaoRespostaPK itemPk = new TurmaQuestaoOpcaoRespostaPK();
//					
//					itemPk.setFuncionario(PrincipalThreadLocal.USER.get().getUsername());
//					itemPk.setTurmaQuestao(turmaQuestoes.get(i).getId().getTurmaQuestao());
//					itemPk.setTurmaQuestaoOpcao(turmaQuestaoOpcaoResposta.getId().getTurmaQuestaoOpcao());
//					item.setOrdemResposta(turmaQuestaoOpcaoResposta.getOrdemResposta());
//					item.setId(itemPk);
//
//					turmaQuestaoOpcaoRespostaRepository.save(item);
//				}
//			}
//		}
//		Notificacao notificacao = notificacaoRepository.findByFuncionarioEIndentificacaoETipo(PrincipalThreadLocal.USER.get().getUsername(), turmaQuestaoTurma.getTurma().getId().toString(), 6);
//		notificacao.setDataLido(Calendar.getInstance());
//		notificacao.setLido(true);
//		
//		return notificacaoRepository.update(notificacao);
//	}
//
//	public List<TurmaQuestaoResposta> findQuestoesRespondidasByFunc(String treinamento, Integer turma) {
//		getLog().fine("Find TurmaQuestaoResposta By Func:");
//		
//		return null;
//	}
//}
