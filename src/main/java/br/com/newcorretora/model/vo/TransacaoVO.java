package br.com.newcorretora.model.vo;

import java.io.Serializable;

public class TransacaoVO implements Serializable {

	private static final long serialVersionUID = -3056799215262099319L;
	
	private String sistemaId;
	
	private String nomeSistema;
	
	private String uri;
	
	private String programa;
	
	private String flag;
	
	private String bookEntrada;
	
	private String bookSaida;

	private String diretorioEntrada;
	
	private String diretorioSaida;

	public String getSistemaId() {
		return sistemaId;
	}

	public void setSistemaId(String sistemaId) {
		this.sistemaId = sistemaId;
	}

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getBookEntrada() {
		return bookEntrada;
	}

	public void setBookEntrada(String bookEntrada) {
		this.bookEntrada = bookEntrada;
	}

	public String getBookSaida() {
		return bookSaida;
	}

	public void setBookSaida(String bookSaida) {
		this.bookSaida = bookSaida;
	}

	public String getDiretorioEntrada() {
		return diretorioEntrada;
	}

	public void setDiretorioEntrada(String diretorioEntrada) {
		this.diretorioEntrada = diretorioEntrada;
	}

	public String getDiretorioSaida() {
		return diretorioSaida;
	}

	public void setDiretorioSaida(String diretorioSaida) {
		this.diretorioSaida = diretorioSaida;
	}

}
