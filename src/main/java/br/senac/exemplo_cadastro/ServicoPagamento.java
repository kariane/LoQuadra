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

@Path("pagamento")
public class ServicoPagamento {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Pagamento pagamento) {
		
		try {
			DaoPagamento.inserir_pagamento(pagamento);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pagamento> listar(){
		try {
			return DaoPagamento.listar_pagamento();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void atualizar(Pagamento pagamento) {
		try {
			DaoPagamento.atualizar_pagamento(pagamento);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Pagamento pagamento) {
		try {
			DaoPagamento.deletar_pagamento(pagamento);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
