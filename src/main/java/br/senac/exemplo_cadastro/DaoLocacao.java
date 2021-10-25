package br.senac.exemplo_cadastro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DaoLocacao {

	public static void inserir_locacao(Locacao locacao) throws Exception {
		String sql = "INSERT INTO locacao(id_usuario, id_quadra, id_pagamento, data_hora_inicial, data_hora_final, valor, status_locacao) VALUES(?, ?, ?, ?, ?, ?, ?);";

		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){

			ps.setInt(1, locacao.getIdUsuario());
			ps.setInt(2, locacao.getIdQuadra());
			ps.setInt(3, locacao.getIdPagamento());
			ps.setString(4, locacao.getData_hora_inicial());
			ps.setString(5, locacao.getData_hora_final());
			ps.setFloat(6, locacao.getValor());
			ps.setString(7, locacao.getStatus_locacao());

			ps.execute();
		}

	}

	public static List<Locacao> listar_locacao()throws Exception  {

		String sql = "SELECT * FROM locacao";

		List<Locacao> resultados = new ArrayList<Locacao>();

		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Locacao locacao = new Locacao();

				locacao.setId(rs.getInt("id_locacao"));
				locacao.setIdUsuario(rs.getInt("id_usuario"));
				locacao.setIdQuadra(rs.getInt("id_quadra"));
				locacao.setIdPagamento(rs.getInt("id_pagamento"));
				locacao.setData_hora_inicial(rs.getString("data_hora_inicial"));
				locacao.setData_hora_final(rs.getString("data_hora_final"));
				locacao.setValor(rs.getFloat("valor"));
				locacao.setStatus_locacao(rs.getString("status_locacao"));

				resultados.add(locacao);
			}
		}
		return resultados;
	}

	public static void atualizar_locacao(Locacao locacao) throws Exception {
		String sql = "UPDATE locacao SET id_usuario = ?, id_quadra = ?, id_pagamento = ?, data_hora_inicial = ?, data_hora_final = ?, valor = ?, status_locacao = ? WHERE id_locacao = ?;";

		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, locacao.getIdUsuario());
			ps.setInt(2, locacao.getIdQuadra());
			ps.setInt(3, locacao.getIdPagamento());
			ps.setString(4, locacao.getData_hora_inicial());
			ps.setString(5, locacao.getData_hora_final());
			ps.setFloat(6, locacao.getValor());
			ps.setString(7, locacao.getStatus_locacao());
			ps.setInt(8, locacao.getId());

			ps.execute();
		}

	}

	public static void deletar_locacao(Locacao locacao) throws Exception {
		String sql = "DELETE FROM locacao  WHERE id_locacao = ?;";

		//try-with-resources
		try (PreparedStatement ps = DB.connect().prepareStatement(sql)){
			ps.setInt(1, locacao.getId());

			ps.execute();
		}

	}

}
