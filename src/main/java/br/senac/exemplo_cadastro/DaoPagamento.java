package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoPagamento {
	
	public static void inserir_pagamento(Pagamento pagamento) throws Exception {
		String sql = "INSERT INTO pagamento(tipo_pagamento) VALUES(?);";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, pagamento.getTipoPagamento());
			
			
			ps.execute();
		}
		
	}
	
	public static List<Pagamento> listar_pagamento()throws Exception  {
		
		String sql = "SELECT * FROM pagamento";
		
		List<Pagamento> resultados = new ArrayList<Pagamento>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Pagamento pagamento = new Pagamento();
				
				
				pagamento.setId(rs.getInt("id_pagamento"));
				pagamento.setTipoPagamento(rs.getString("tipo_pagamento"));
				
				resultados.add(pagamento);
			}
		}
		return resultados;
	}
	
	public static void atualizar_pagamento(Pagamento pagamento) throws Exception {
		String sql = "UPDATE pagamento SET tipo_pagamento = ? WHERE id_pagamento = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, pagamento.getTipoPagamento());
			ps.setInt(2, pagamento.getId());
			
			ps.execute();
		}
		
	}
	
	public static void deletar_pagamento(Pagamento pagamento) throws Exception {
		String sql = "DELETE FROM pagamento  WHERE id_pagamento = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, pagamento.getId());
			
			ps.execute();
		}
		
	}


}