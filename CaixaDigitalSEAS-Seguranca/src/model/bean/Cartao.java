package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartao")
public class Cartao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCartao;
	@Column
	private int numeroCartao;
	@Column
	private int viaCartao;
	@Column
	private String cpfCartao;
	@Column
	private String nomeCartao;
	
	public int getIdCartao() {
		return idCartao;
	}
	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}
	public int getViaCartao() {
		return viaCartao;
	}
	public void setViaCartao(int viaCartao) {
		this.viaCartao = viaCartao;
	}
	public String getCpfCartao() {
		return cpfCartao;
	}
	public void setCpfCartao(String cpfCartao) {
		this.cpfCartao = cpfCartao;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	
}
