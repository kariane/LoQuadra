package br.senac.exemplo_cadastro;

public class RelatorioQuadrasMaisCarasAlugadas {

	private int idLocacao;
	private int idUsuario;
	private int idQuadra;
	private String tipoQuadra;
	private double valor;
	private String statusLocacao;
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
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
	public String getTipoQuadra() {
		return tipoQuadra;
	}
	public void setTipoQuadra(String tipoQuadra) {
		this.tipoQuadra = tipoQuadra;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getStatusLocacao() {
		return statusLocacao;
	}
	public void setStatusLocacao(String statusLocacao) {
		this.statusLocacao = statusLocacao;
	}
	
	
}
