/**
 * 
 */
package br.com.newcorretora.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Fabio Iwakoshi
 *
 */
@MappedSuperclass
public abstract class AuditedEntity implements Serializable {
	/** * */
	private static final long serialVersionUID = -9210299262782006525L;

	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timestamp_alteracao")
	private Calendar timestampAlteracao;

	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timestamp_inclusao", nullable=false, updatable=false)
	private Calendar timestampInclusao;

	@JsonIgnore
	@Column(name="usuario_alteracao", length=7)
	private String usuarioAlteracao;

	@JsonIgnore
	@Column(name="usuario_inclusao", nullable=false, updatable=false, length=7)
	private String usuarioInclusao;

	@JsonIgnore
	public Calendar getTimestampAlteracao() {
		return this.timestampAlteracao;
	}

	@JsonProperty
	public void setTimestampAlteracao(Calendar timestampAlteracao) {
		this.timestampAlteracao = timestampAlteracao;
	}

	@JsonIgnore
	public Calendar getTimestampInclusao() {
		return this.timestampInclusao;
	}

	@JsonProperty
	public void setTimestampInclusao(Calendar timestampInclusao) {
		this.timestampInclusao = timestampInclusao;
	}

	@JsonIgnore
	public String getUsuarioAlteracao() {
		return this.usuarioAlteracao;
	}

	@JsonProperty
	public void setUsuarioAlteracao(String usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}

	@JsonIgnore
	public String getUsuarioInclusao() {
		return this.usuarioInclusao;
	}

	@JsonProperty
	public void setUsuarioInclusao(String usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}
}
