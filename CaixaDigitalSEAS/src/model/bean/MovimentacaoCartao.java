package model.bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movimentacaoCartao")
public class MovimentacaoCartao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMovimentacao;
	
	@Column
	private Calendar dataMovimentacao;

	@ManyToOne
	private Cartao cartao;
	
	@ManyToOne
	private TipoMovimentacaoCartao tipoMovimentacaoCartao;
	

	public Integer getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Integer idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public TipoMovimentacaoCartao getTipoMovimentacaoCartao() {
		return tipoMovimentacaoCartao;
	}

	public void setTipoMovimentacaoCartao(TipoMovimentacaoCartao tipoMovimentacaoCartao) {
		this.tipoMovimentacaoCartao = tipoMovimentacaoCartao;
	}
	
	
}
