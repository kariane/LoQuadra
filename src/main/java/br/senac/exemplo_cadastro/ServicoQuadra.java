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

@Path("quadra")
public class ServicoQuadra {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Quadra quadra) {
		
		try {
			DaoQuadra.inserir_quadra(quadra);;			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ListM<Quadra> listar() {
		
		try {
			return DaoQuadra.listar_quadra();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Quadra quadra) {
		
		try {
			DaoQuadra.atualizar_quadra(quadra);;			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Quadra quadra) {
		try {
			DaoQuadra.deletar_quadra(quadra);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
