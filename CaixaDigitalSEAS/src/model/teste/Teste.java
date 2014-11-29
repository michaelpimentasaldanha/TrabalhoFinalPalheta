package model.teste;

//import model.bean.Cartao;
import java.util.Calendar;

import model.bean.Cartao;
//import model.bean.Conta;
import model.bean.MovimentacaoCartao;
import model.bean.TipoMovimentacaoCartao;
import model.dao.CartaoDAO;
//import model.bean.TipoMovimentacaoCartao;
//import model.dao.CartaoDAO;
//import model.dao.CartaoDAO;
//import model.dao.ContaDAO;
import model.dao.MovimentacaoCartaoDAO;
//import model.dao.TipoMovimentacaoCartaoDAO;
//import model.dao.TipoMovimentacaoCartaoDAO;
import model.dao.TipoMovimentacaoCartaoDAO;

public class Teste {

public static void main(String[] args) {
		
//		CartaoDAO cartaoDAO = new CartaoDAO();
//		ContaDAO contaDAO = new ContaDAO();
//		TipoMovimentacaoCartaoDAO tipoMovimentacaoCartaoDAO = new TipoMovimentacaoCartaoDAO();
		MovimentacaoCartaoDAO movimentacaoCartaoDAO = new MovimentacaoCartaoDAO();

/*
		Cartao cartao = new Cartao();
		cartao.setNumeroCartao(2);
		cartao.setNomeCartao("Saldanha");
		cartao.setCpfCartao("12312312312");
		cartao.setViaCartao(1);
		cartaoDAO.salvar(cartao);
		System.out.println(cartao.getIdCartao());
		
		Conta conta = new Conta();
		conta.setConta(1234567898);
		conta.setCpf("12312312312");
		conta.setNome("Saldanha");
		conta.setSaldo(150.50f);
		contaDAO.salvar(conta);
		System.out.println(conta.getSaldo());
		
		
		
	*/	
		MovimentacaoCartao movimentacaoCartao = new MovimentacaoCartao();
		movimentacaoCartao.setDataMovimentacao(Calendar.getInstance());
		Cartao cartao = new Cartao();
		cartao.setIdCartao(8);
		cartao.setCpfCartao("11111111111");
		cartao.setNomeCartao("Pimenta Saldanha");
		cartao.setNumeroCartao(123);
		cartao.setViaCartao(98);
		CartaoDAO cartaoDAO = new CartaoDAO();
		cartaoDAO.salvar(cartao);
		movimentacaoCartao.setCartao(cartao);
		TipoMovimentacaoCartao tipoMovimentacaoCartao = new TipoMovimentacaoCartao();
		tipoMovimentacaoCartao.setIdTipoMovimentacao(3);
		tipoMovimentacaoCartao.setDescricaoMovimentacao("TITULAR");
		TipoMovimentacaoCartaoDAO tipoMovimentacaoCartaoDAO = new TipoMovimentacaoCartaoDAO();
		tipoMovimentacaoCartaoDAO.salvar(tipoMovimentacaoCartao);
		movimentacaoCartao.setTipoMovimentacaoCartao(tipoMovimentacaoCartao);
		movimentacaoCartaoDAO.salvar(movimentacaoCartao);
		System.out.println("\nN° Cartão: "+movimentacaoCartao.getCartao().getNumeroCartao()
				  +"\nData: "+movimentacaoCartao.getDataMovimentacao()
				  +"\nVia: "+movimentacaoCartao.getCartao().getViaCartao()
				  +"\nLocal do cartao:"+movimentacaoCartao.getTipoMovimentacaoCartao().getDescricaoMovimentacao());
/*	
		MovimentacaoCartao movimentacaoCartao = new MovimentacaoCartao();
		movimentacaoCartao.setDataMovimentacao(Calendar.getInstance());
		Cartao cartao = new Cartao();
		cartao.setIdCartao(3);
		cartao.getCpfCartao();
		cartao.getNomeCartao();
		cartao.getNumeroCartao();
		cartao.getViaCartao();
		//CartaoDAO cartaoDAO = new CartaoDAO();
		//cartaoDAO.salvar(cartao);
		movimentacaoCartao.setCartao(cartao);
		TipoMovimentacaoCartao tipoMovimentacaoCartao = new TipoMovimentacaoCartao();
		tipoMovimentacaoCartao.setIdTipoMovimentacao(2);
		tipoMovimentacaoCartao.getDescricaoMovimentacao();
		//TipoMovimentacaoCartaoDAO tipoMovimentacaoCartaoDAO = new TipoMovimentacaoCartaoDAO();
		//tipoMovimentacaoCartaoDAO.salvar(tipoMovimentacaoCartao);
		movimentacaoCartao.setTipoMovimentacaoCartao(tipoMovimentacaoCartao);
		movimentacaoCartaoDAO.salvar(movimentacaoCartao);
		System.out.println("\nN° Cartão: "+movimentacaoCartao.getCartao().getNumeroCartao()
						  +"\nData: "+movimentacaoCartao.getDataMovimentacao()
						  +"\nVia: "+movimentacaoCartao.getCartao().getViaCartao()
						  +"\nLocal do cartao:"+movimentacaoCartao.getTipoMovimentacaoCartao().getDescricaoMovimentacao());
	*/	/*		cartaoDAO.remover(cartao);
		
			
		List<Cliente> clientes = clienteDao.listarTodos();
				
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		} */
	
/*		Cliente cliente = clienteDao.obterPorId(2);
		cliente.setNome("Beltrano da Silva");
		
		clienteDao.salvar(cliente);
		System.out.println(cliente.getNome());
		 
		
		Cartao cartao = cartaoDAO.obterPorId(2);
		
		cartaoDAO.remover(cartao);
		
		System.out.println(cartao.getNomeCartao());
	*/
	
	}

}
