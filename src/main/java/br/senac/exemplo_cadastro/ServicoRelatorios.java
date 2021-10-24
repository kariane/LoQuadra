package br.senac.exemplo_cadastro;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("relatorio")
public class ServicoRelatorios {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Quadra> listar(){
		try {
			return DaoRelatorios.relatorio_quadras_mais_caras();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
