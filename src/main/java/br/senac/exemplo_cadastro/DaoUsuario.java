package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DaoUsuario {

	public static void inserir_usuario(Usuario usuario) throws Exception {
		
		String sql = "INSERT INTO usuario (nome, email, celular, documento, id_endereco) VALUES (?, ?, ?, ?, ?);";
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)) {
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getCelular());
			ps.setString(4, usuario.getDocumento());
			ps.setInt(5, usuario.getIdEndereco());
			
			ps.execute();
		}
	}
	
	public static List<Usuario> listar_usuario()throws Exception  {
		
		String sql = "SELECT * FROM usuario";
		
		List<Usuario> resultados = new ArrayList<Usuario>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Usuario usuario = new Usuario();				
				
				usuario.setId(rs.getInt("id_usuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCelular(rs.getString("celular"));
				usuario.setDocumento(rs.getString("documento"));
				usuario.setIdEndereco(rs.getInt("id_endereco"));
				
				resultados.add(usuario);
			}
		}
		return resultados;
	}
	
	public static void atualizar_usuario(Usuario usuario) throws Exception {
		String sql = "UPDATE quadra SET nome = ?, email = ?, celular = ?, documento = ?, id_endereco = ? WHERE id_usuario = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getCelular());
			ps.setString(4, usuario.getDocumento());
			ps.setInt(5, usuario.getIdEndereco());
			ps.setInt(6, usuario.getId());
			
			ps.execute();
		}
	}
	
	public static void deletar_usuario(Usuario usuario) throws Exception {
		String sql = "DELETE FROM quadra WHERE id_usuario = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, usuario.getId());
			
			ps.execute();
		}
		
	}

}
