package control;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.bean.Cartao;
import model.dao.CartaoDAO;

// bean do JSF controle que vai receber requisições das view
@ManagedBean(name="controleCartao")
// Tempo de sessao - enquanto ativa os valores do objetos continuam existindo
@SessionScoped
public class ControleCartao {

		Cartao cartao;
		//Repositorio que cuida das regras de negocios
		CartaoDAO cartaoDAO;
		// Criação da lista que vai receber a lista do model
		List<Cartao> cartoes;
		
		//Criação do construtor da classe ClontroleCartao
		public ControleCartao(){
			cartaoDAO = new CartaoDAO();
			cartao = new Cartao();
		}
		
		public void Cartao(){
			cartao = new Cartao();
			cartaoDAO = new CartaoDAO();
		}
		
		public String novo(){
			cartao = new Cartao();
			return "cadastrarCartao";
		}
		
		public String editar(){
			return "editarCartao";		
		}
		
		public String remover(){
			cartaoDAO.remover(cartao);
			return "listadecartoes";
		}
		
		public String salvar(){
			cartaoDAO.salvar(cartao);
			return "listadecartoes";
			
		}

		public Cartao getCartao() {
			return cartao;
		}
		public void setCartao(Cartao cartao) {
			this.cartao = cartao;
		}
		public CartaoDAO getCartaoDAO() {
			return cartaoDAO;
		}
		public void setCartaoDAO(CartaoDAO cartaoDAO) {
			this.cartaoDAO = cartaoDAO;
		}
		public List<Cartao> getCartoes() {
			cartoes = cartaoDAO.listarCartoes();
			return cartoes;
		}
		public void setCartoes(List<Cartao> cartoes) {
			this.cartoes = cartoes;
		}
}
