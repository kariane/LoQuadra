package br.senac.exemplo_cadastro;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("relatorio")
public class ServicoRelatorios {

	@Path("relatorio1")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Relatorio> listar1(){
		try {
			return DaoRelatorios.relatorio_quadras_mais_caras();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Path("relatorio2")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Relatorio2> listar2(){
		try {
			return DaoRelatorios.relatorio_geral();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}