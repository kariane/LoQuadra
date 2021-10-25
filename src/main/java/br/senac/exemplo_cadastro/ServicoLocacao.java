package br.senac.exemplo_cadastro;

import java.util.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("locacao")
public class ServicoLocacao{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Locacao locacao) {

		try {
			DaoLocacao.inserir_locacao(locacao);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Locacao> listar() {
		try {
			return DaoLocacao.listar_locacao();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Locacao locacao) {

		try {
			DaoLocacao.atualizar_locacao(locacao);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Locacao locacao) {
		try {
			DaoLocacao.deletar_locacao(locacao);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

