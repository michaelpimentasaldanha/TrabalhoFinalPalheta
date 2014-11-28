package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.bean.Cartao;

public class CartaoDAO {

	EntityManagerFactory emf;
	EntityManager em;
	
	public CartaoDAO(){
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();
	}
	
	public Cartao obterPorId(int idCartao){
		em.getTransaction().begin();
		Cartao cartao = em.find(Cartao.class, idCartao);
		em.getTransaction().commit();
		emf.close();
		return cartao;
	}
	
	public void salvar(Cartao cartao){
		em.getTransaction().begin();
		em.merge(cartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Cartao cartao){
		em.getTransaction().begin();
		em.remove(cartao);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cartao> listarCartoes(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cartao from Cartao cartao");
		List<Cartao> cartoes = consulta.getResultList();		
		em.getTransaction().commit();
		emf.close();
		return cartoes;
	}
	
	
	

}
