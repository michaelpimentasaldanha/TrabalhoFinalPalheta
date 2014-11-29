package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.bean.Conta;

public class ContaDAO {

	EntityManagerFactory emf;
	EntityManager em;
	
	public ContaDAO(){
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();
	}
	
	public Conta obterPorId(int id){
		Conta conta = em.find(Conta.class, id);
		return conta;
	}
	
	public void salvar(Conta conta){
		em.getTransaction().begin();
		em.merge(conta);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Conta conta){
		em.getTransaction().begin();
		em.remove(conta);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Conta> listarContas(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select conta from Conta conta");
		List<Conta> contas = consulta.getResultList();		
		em.getTransaction().commit();
		emf.close();
		return contas;
	}
}
