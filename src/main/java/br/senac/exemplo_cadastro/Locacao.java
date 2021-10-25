package br.senac.exemplo_cadastro;

public class Locacao {
	private int id;
	private int idUsuario;
	private int idQuadra;
	private int idPagamento;
	private String data_hora_inicial;
	private String data_hora_final;
	private float valor;
	private String status_locacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdQuadra() {
		return idQuadra;
	}

	public void setIdQuadra(int idQuadra) {
		this.idQuadra = idQuadra;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public String getData_hora_inicial() {
		return data_hora_inicial;
	}

	public void setData_hora_inicial(String data_hora_inicial) {
		this.data_hora_inicial = data_hora_inicial;
	}

	public String getData_hora_final() {
		return data_hora_final;
	}

	public void setData_hora_final(String data_hora_final) {
		this.data_hora_final = data_hora_final;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getStatus_locacao() {
		return status_locacao;
	}

	public void setStatus_locacao(String status_locacao) {
		this.status_locacao = status_locacao;
	}

}
