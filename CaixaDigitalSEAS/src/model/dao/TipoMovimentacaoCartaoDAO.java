package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.bean.TipoMovimentacaoCartao;

public class TipoMovimentacaoCartaoDAO {
	EntityManagerFactory emf;
	EntityManager em;
	
	public TipoMovimentacaoCartaoDAO(){
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();
	}
	
	public TipoMovimentacaoCartao obterPorId(int idTipoMovimentacao){
		em.getTransaction().begin();
		TipoMovimentacaoCartao tipoMovimentacaoCartao = em.find(TipoMovimentacaoCartao.class, idTipoMovimentacao);
		em.getTransaction().commit();
		emf.close();
		return tipoMovimentacaoCartao;
	}
	
	public void salvar(TipoMovimentacaoCartao tipoMovimentacaoCartao){
		em.getTransaction().begin();
		em.merge(tipoMovimentacaoCartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(TipoMovimentacaoCartao tipoMovimentacaoCartao){
		em.getTransaction().begin();
		em.remove(tipoMovimentacaoCartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoMovimentacaoCartao> listartiposdemovimentacoescartao(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select tipoMovimentacaoCartao from TipoMovimentacaoCartao tipoMovimentacaoCartao");
		List<TipoMovimentacaoCartao> listartiposdemovimentacoescartao = consulta.getResultList();		
		em.getTransaction().commit();
		emf.close();
		return listartiposdemovimentacoescartao;
	}
	
}
