package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoMovimentacaoCartao")
public class TipoMovimentacaoCartao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTipoMovimentacao;
	
	@Column
	private String descricaoMovimentacao;

	
	public Integer getIdTipoMovimentacao() {
		return idTipoMovimentacao;
	}
	public void setIdTipoMovimentacao(Integer idTipoMovimentacao) {
		this.idTipoMovimentacao = idTipoMovimentacao;
	}
	public String getDescricaoMovimentacao() {
		return descricaoMovimentacao;
	}
	public void setDescricaoMovimentacao(String descricaoMovimentacao) {
		this.descricaoMovimentacao = descricaoMovimentacao;
	}
}
