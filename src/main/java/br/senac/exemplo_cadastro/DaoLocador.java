package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoLocador {
	
	public static void inserir_locador(Locador locador) throws Exception {
		String sql = "INSERT INTO locador(nome, email, celular, documento_cnpj, documento_cpf) VALUES(?, ?, ?, ?, ?);";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, locador.getNome());
			ps.setString(2, locador.getEmail());
			ps.setString(3, locador.getCelular());
			ps.setString(4, locador.getDocumentoCNPJ());
			ps.setString(5, locador.getDocumentoCPF());
			
			ps.execute();
		}
		
	}
	
	public static List<Locador> listar_locador()throws Exception  {
		
		String sql = "SELECT * FROM locador";
		
		List<Locador> resultados = new ArrayList<Locador>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Locador locador = new Locador();
				
				
				locador.setId(rs.getInt("id_locador"));
				locador.setNome(rs.getString("nome"));
				locador.setEmail(rs.getString("email"));
				locador.setCelular(rs.getString("celular"));
				locador.setDocumentoCNPJ(rs.getString("documento_cnpj"));
				locador.setDocumentoCPF(rs.getString("documento_cpf"));
				
				resultados.add(locador);
			}
		}
		return resultados;
	}
	
	public static void atualizar_locador(Locador locador) throws Exception {
		String sql = "UPDATE locador SET nome = ?, email = ?, celular = ?, documento_cnpj = ?, documento_cpf = ? WHERE id_locador = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, locador.getNome());
			ps.setString(2, locador.getEmail());
			ps.setString(3, locador.getCelular());
			ps.setString(4, locador.getDocumentoCNPJ());
			ps.setString(5, locador.getDocumentoCPF());
			ps.setInt(6, locador.getId());
			
			ps.execute();
		}
		
	}
	
	public static void deletar_locador(Locador locador) throws Exception {
		String sql = "DELETE FROM locador  WHERE id_locador = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, locador.getId());
			
			ps.execute();
		}
		
	}

}