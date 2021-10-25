package br.senac.exemplo_cadastro;

public class Relatorio {

	private int idLocacao;
	private String nome;
	private String nomeQuadra;
	private String tipoQuadra;
	private float valor;
	private String statusLocacao;
	
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeQuadra() {
		return nomeQuadra;
	}
	public void setNomeQuadra(String nomeQuadra) {
		this.nomeQuadra = nomeQuadra;
	}
	public String getTipoQuadra() {
		return tipoQuadra;
	}
	public void setTipoQuadra(String tipoQuadra) {
		this.tipoQuadra = tipoQuadra;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getStatusLocacao() {
		return statusLocacao;
	}
	public void setStatusLocacao(String statusLocacao) {
		this.statusLocacao = statusLocacao;
	}
	
	
}
