package model.teste;

//import model.bean.Cartao;
import model.bean.Conta;
//import model.dao.CartaoDAO;
import model.dao.ContaDAO;

public class Teste {

public static void main(String[] args) {
		
//		CartaoDAO cartaoDAO = new CartaoDAO();
		ContaDAO contaDAO = new ContaDAO();

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
*/		Conta conta = new Conta();
		conta.setId(3);
		Conta conta2 = contaDAO.obterPorId(conta.getId());
		System.out.println("Nome: "+conta2.getNome() + "\nSaldo: R$"+conta2.getSaldo());
		
		/*		cartaoDAO.remover(cartao);
		
			
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
