package control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.bean.Conta;
import model.dao.ContaDAO;

@ManagedBean(name="controleConta")
@SessionScoped
public class ControleConta {

		Conta conta;
		Conta conta2;
		ContaDAO contaDAO;
		List<Conta> contas;
		
		
		public ControleConta(){
			contaDAO = new ContaDAO();
			conta = new Conta();
		}
		
		public void Conta(){
			conta = new Conta();
			contaDAO = new ContaDAO();
		}
		
		public String novo(){
			conta = new Conta();
			return "cadastrarConta";
		}
		
		public String editar(){
			return "editarConta";		
		}
		
		public String remover(){
			contaDAO.remover(conta);
			return "listadeconta";
		}
		
		public String salvar(){
			contaDAO.salvar(conta);
			return "listadecontas";
		}
		
		public String buscarSaldo(){
			conta = contaDAO.obterPorId(conta.getId());
			return "contaselecionada";
		}

		public Conta getConta() {
			return conta;
		}
		public void setConta(Conta conta) {
			this.conta = conta;
		}
		public ContaDAO getContaDAO() {
			return contaDAO;
		}
		public void setContaDAO(ContaDAO contaDAO) {
			this.contaDAO = contaDAO;
		}
		public List<Conta> getContas() {
			contas = contaDAO.listarContas();
			return contas;
		}
		public void setCartoes(List<Conta> contas) {
			this.contas = contas;
		}
}
