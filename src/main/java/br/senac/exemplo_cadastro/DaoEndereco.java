package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoEndereco {
	
	public static void inserir_endereco(Endereco endereco) throws Exception {
		String sql = "INSERT INTO endereco(cep, logradouro, numero, complemento, bairro, cidade, estado, pais) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getLogradouro());
			ps.setString(3, endereco.getNumero());
			ps.setString(4, endereco.getComplemento());
			ps.setString(5, endereco.getBairro());
			ps.setString(6, endereco.getCidade());
			ps.setString(7, endereco.getEstado());
			ps.setString(8, endereco.getPais());
			
			ps.execute();
		}
		
	}
	
	public static List<Endereco> listar_endereco()throws Exception  {
		
		String sql = "SELECT * FROM endereco";
		
		List<Endereco> resultados = new ArrayList<Endereco>();
		
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Endereco endereco = new Endereco();
				
				
				endereco.setId(rs.getInt("id_endereco"));
				endereco.setCep(rs.getString("cep"));
				endereco.setLogradouro(rs.getNString("logradouro"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setBairro(rs.getNString("bairro"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setEstado(rs.getString("estado"));
				endereco.setPais(rs.getNString("pais"));
				
				
				resultados.add(endereco);
			}
		}
		return resultados;
	}
	
	public static void atualizar_endereco(Endereco endereco) throws Exception {
		String sql = "UPDATE endereco SET cep = ?, logradouro = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ?, pais = ? WHERE id_endereco = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getLogradouro());
			ps.setString(3, endereco.getNumero());
			ps.setString(4, endereco.getComplemento());
			ps.setString(5, endereco.getBairro());
			ps.setString(6, endereco.getCidade());
			ps.setString(7, endereco.getEstado());
			ps.setString(8, endereco.getPais());
			ps.setInt(9, endereco.getId());
			
			ps.execute();
		}
		
	}
	
	public static void deletar_endereco(Endereco endereco) throws Exception {
		String sql = "DELETE FROM endereco  WHERE id_endereco = ?;";
		
		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, endereco.getId());
			
			ps.execute();
		}
		
	}

}
