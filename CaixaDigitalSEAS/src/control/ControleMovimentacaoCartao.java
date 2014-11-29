package control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.bean.MovimentacaoCartao;
import model.dao.MovimentacaoCartaoDAO;

@ManagedBean(name="controleMovimentacaoCartao")
@SessionScoped
public class ControleMovimentacaoCartao {
	
		MovimentacaoCartao movimentacaoCartao;
		MovimentacaoCartaoDAO movimentacaoCartaoDAO;
		List<MovimentacaoCartao> movimentacaoCartaos;
		
		public ControleMovimentacaoCartao(){
			movimentacaoCartao = new MovimentacaoCartao();
			movimentacaoCartaoDAO = new MovimentacaoCartaoDAO();
		}
		
		public void MovimentacaoCartao(){
			movimentacaoCartao = new MovimentacaoCartao();
			movimentacaoCartaoDAO = new MovimentacaoCartaoDAO();
		}
		
		public String novo(){
			movimentacaoCartao = new MovimentacaoCartao();
			return "cadastrarMovimentacaoCartao";
		}
		
		public String editar(){
			return "editarMovimentacaoCartao";		
		}
		
		public String remover(){
			movimentacaoCartaoDAO.remover(movimentacaoCartao);
			return "listaMovimentacaoCartao";
		}
		
		public String salvar(){
			movimentacaoCartaoDAO.salvar(movimentacaoCartao);
			return "listaMovimentacaoCartao";
		}

		public MovimentacaoCartao getMovimentacaoCartao() {
			return movimentacaoCartao;
		}

		public void setMovimentacaoCartao(MovimentacaoCartao movimentacaoCartao) {
			this.movimentacaoCartao = movimentacaoCartao;
		}

		public MovimentacaoCartaoDAO getMovimentacaoCartaoDAO() {
			return movimentacaoCartaoDAO;
		}

		public void setMovimentacaoCartaoDAO(
				MovimentacaoCartaoDAO movimentacaoCartaoDAO) {
			this.movimentacaoCartaoDAO = movimentacaoCartaoDAO;
		}
		
		public List<MovimentacaoCartao> getMovimentacaoCartaos() {
			movimentacaoCartaos = movimentacaoCartaoDAO.listarmovimentacoescartao();
			return movimentacaoCartaos;
		}

		public void setMovimentacaoCartaos(
				List<MovimentacaoCartao> movimentacaoCartaos) {
			this.movimentacaoCartaos = movimentacaoCartaos;
		}
		
}