package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoRelatorios {
	
	public static List<Quadra> relatorio_quadras_mais_caras() throws Exception {
		
		String sql = "SELECT B.id_locacao, C.nome, A.nome_quadra, A.tipo_quadra, B.valor, B.status_locacao "
				+ "FROM quadra AS A INNER JOIN locacao AS B ON B.? = A.? LEFT JOIN usuario AS C "
				+ "ON B.?=C.? WHERE B.status_locacao=\"alugado\" ORDER BY valor DESC\r\n";
		
		List<Quadra> resultados = new ArrayList<Quadra>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Quadra relatorio = new Quadra();
				Usuario usuario = new Usuario();
				
				relatorio.setId(rs.getInt("id_quadra"));
				usuario.setId(rs.getInt("id_usuario"));
				
				resultados.add(relatorio);
			}
		}
		return resultados;
	}
}