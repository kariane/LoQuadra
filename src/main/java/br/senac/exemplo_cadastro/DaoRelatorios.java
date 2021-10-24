package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoRelatorios {
	
	public static List<Quadra> relatorio_quadras_mais_caras() throws Exception {
		
		String sql = "SELECT locacao.id_locacao,locacao.id_usuario,locacao.id_quadra,quadra.tipo_quadra,locacao.valor,locacao.status_locacao\r\n"
				+ "FROM quadra INNER JOIN locacao\r\n"
				+ "ON locacao.? = quadra.?\r\n"
				+ "WHERE status_locacao=\"alugado\" ORDER BY valor DESC";
		
		List<Quadra> resultados = new ArrayList<Quadra>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Quadra relatorio = new Quadra();				
				
				relatorio.setId(rs.getInt("id_quadra"));
				
				resultados.add(relatorio);
			}
		}
		return resultados;
	}
}