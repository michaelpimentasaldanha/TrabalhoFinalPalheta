package control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.bean.TipoMovimentacaoCartao;
import model.dao.TipoMovimentacaoCartaoDAO;

@ManagedBean(name="controleTipoMovimentacaoCartao")
@SessionScoped
public class ControleTipoMovimentacaoCartao {
	
		TipoMovimentacaoCartao tipoMovimentacaoCartao;
		TipoMovimentacaoCartaoDAO tipoMovimentacaoCartaoDAO;
		List<TipoMovimentacaoCartao> tipoMovimentacaoCartaos;
		
		public ControleTipoMovimentacaoCartao(){
			tipoMovimentacaoCartao = new TipoMovimentacaoCartao();
			tipoMovimentacaoCartaoDAO = new TipoMovimentacaoCartaoDAO();
		}
		
		public void TipoMovimentacaoCartao(){
			tipoMovimentacaoCartao = new TipoMovimentacaoCartao();
			tipoMovimentacaoCartaoDAO = new TipoMovimentacaoCartaoDAO();
		}
		
		public String novo(){
			tipoMovimentacaoCartao = new TipoMovimentacaoCartao();
			return "cadastrarTipoMovimentacaoCartao";
		}
		
		public String editar(){
			return "editarTipoMovimentacaoCartao";		
		}
		
		public String remover(){
			tipoMovimentacaoCartaoDAO.remover(tipoMovimentacaoCartao);
			return "listadeTipoMovimentacaoCartao";
		}
		
		public String salvar(){
			tipoMovimentacaoCartaoDAO.salvar(tipoMovimentacaoCartao);
			return "listadeTipoMovimentacaoCartao";
		}

		public TipoMovimentacaoCartao getTipoMovimentacaoCartao() {
			return tipoMovimentacaoCartao;
		}

		public void setTipoMovimentacaoCartao(TipoMovimentacaoCartao tipoMovimentacaoCartao) {
			this.tipoMovimentacaoCartao = tipoMovimentacaoCartao;
		}

		public TipoMovimentacaoCartaoDAO getTipoMovimentacaoCartaoDAO() {
			return tipoMovimentacaoCartaoDAO;
		}

		public void setTipoMovimentacaoCartaoDAO(
				TipoMovimentacaoCartaoDAO tipoMovimentacaoCartaoDAO) {
			this.tipoMovimentacaoCartaoDAO = tipoMovimentacaoCartaoDAO;
		}
		
		public List<TipoMovimentacaoCartao> getTipoMovimentacaoCartaos() {
			tipoMovimentacaoCartaos = tipoMovimentacaoCartaoDAO.listartiposdemovimentacoescartao();
			return tipoMovimentacaoCartaos;
		}

		public void setTipoMovimentacaoCartaos(
				List<TipoMovimentacaoCartao> tipoMovimentacaoCartaos) {
			this.tipoMovimentacaoCartaos = tipoMovimentacaoCartaos;
		}
		
}