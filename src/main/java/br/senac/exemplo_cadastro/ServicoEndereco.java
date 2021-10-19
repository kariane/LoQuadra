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

@Path("endereco")
public class ServicoEndereco {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Endereco endereco) {
		
		try {
			DaoEndereco.inserir_endereco(endereco);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Endereco> listar(){
		try {
			return DaoEndereco.listar_endereco();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Endereco endereco) {
		try {
			DaoEndereco.atualizar_endereco(endereco);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Endereco endereco) {
		try {
			DaoEndereco.deletar_endereco(endereco);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

