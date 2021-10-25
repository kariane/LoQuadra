package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoRelatorios {
	
	public static List<Relatorio> relatorio_quadras_mais_caras() throws Exception {
		
		String sql = "SELECT B.id_locacao, C.nome, A.nome_quadra, A.tipo_quadra, B.valor, B.status_locacao "
				+ "FROM quadra AS A INNER JOIN locacao AS B ON B.id_quadra = A.id_quadra LEFT JOIN usuario AS C "
				+ "ON B.id_usuario=C.id_usuario WHERE B.status_locacao=\"alugado\" ORDER BY valor DESC\r\n";
		
		List<Relatorio> resultados = new ArrayList<Relatorio>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Relatorio relatorio = new Relatorio();
				
				relatorio.setIdLocacao(rs.getInt("id_locacao"));
				relatorio.setNome(rs.getString("nome"));
				relatorio.setNomeQuadra(rs.getString("nome_quadra"));
				relatorio.setTipoQuadra(rs.getString("tipo_quadra"));
				relatorio.setValor(rs.getFloat("valor"));
				relatorio.setStatusLocacao(rs.getString("status_locacao"));
				
				resultados.add(relatorio);
			}
		}
		return resultados;
	}
	
	public static List<Relatorio2> relatorio_geral() throws Exception {
		
		String sql = "SELECT MIN(valor) as vquadra_min,MAX(valor) as vquadra_max FROM locacao;";
		
		List<Relatorio2> resultados = new ArrayList<Relatorio2>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Relatorio2 relatorio = new Relatorio2();
				
				relatorio.setVquadra_min(rs.getFloat("vquadra_min"));
				relatorio.setVquadra_max(rs.getFloat("vquadra_max"));
				
				resultados.add(relatorio);
			}				
		}
		return resultados;
	}
}