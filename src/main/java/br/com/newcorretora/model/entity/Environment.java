package br.com.newcorretora.model.entity;

/**
 * Enum de Ambientes
 * 
 * @author Fabio Iwakoshi
 *
 */
public enum Environment {

	DESENVOLVIMENTO("DES"), TESTE_QUALIDADE_SOFTWARE("TQS"), HOMOLOGACAO("HMP"), PRODUCAO("PRD");
	
	private String description;
	
	private Environment(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
