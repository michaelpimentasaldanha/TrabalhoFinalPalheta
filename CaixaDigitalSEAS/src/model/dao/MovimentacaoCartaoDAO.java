package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.bean.MovimentacaoCartao;

public class MovimentacaoCartaoDAO {
	EntityManager em;
	EntityManagerFactory emf;

	public MovimentacaoCartaoDAO(){
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();
	}
	
	public MovimentacaoCartao obterPorId(int idMovimentacao){
		MovimentacaoCartao movimentacaoCartao = em.find(MovimentacaoCartao.class, idMovimentacao);
		return movimentacaoCartao;
	}
	
	public void salvar(MovimentacaoCartao movimentacaoCartao){
		em.getTransaction().begin();
		em.merge(movimentacaoCartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(MovimentacaoCartao movimentacaoCartao){
		em.getTransaction().begin();
		em.remove(movimentacaoCartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<MovimentacaoCartao> listarmovimentacoescartao(){
		Query consulta = em.createQuery("select movimentacaoCartao from MovimentacaoCartao movimentacaoCartao");
		List<MovimentacaoCartao> listarmovimentacoescartao = consulta.getResultList();		
		return listarmovimentacoescartao;
	}

}

