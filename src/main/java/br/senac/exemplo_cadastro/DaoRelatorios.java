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
				relatorio.setTipoQuadra(rs.getString("typo_quadra"));
				relatorio.setValor(rs.getFloat("valor"));
				relatorio.setStatusLocacao(rs.getString("typo_quadra"));
				
				resultados.add(relatorio);
			}
		}
		return resultados;
	}
	
	public static List<Locacao> relatorio_geral() throws Exception {
		
		String sql = "SELECT MIN(A.valor) AS \"Quadra com menor valor\",MAX(A.valor) AS \"Quadra com maior valor\" FROM locacao as A;";
		
		List<Locacao> resultados = new ArrayList<Locacao>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Locacao relatorio = new Locacao();
				
				relatorio.setValor(rs.getFloat("valor"));
				
				resultados.add(relatorio);
			}				
		}
		return resultados;
	}
}