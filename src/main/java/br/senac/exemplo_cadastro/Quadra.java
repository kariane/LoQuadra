package br.senac.exemplo_cadastro;

public class Quadra {

	private int id;
	private int idLocador;
	private int idEndereco;
	private String nomeQuadra;
	private String tipoQuadra;
	private String descricao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdLocador() {
		return idLocador;
	}
	
	public void setIdLocador(int idLocador) {
		this.idLocador = idLocador;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	public String getTipoQuadra() {
		return tipoQuadra;
	}
	
	public void setTipoQuadra(String tipoQuadra) {
		this.tipoQuadra = tipoQuadra;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeQuadra() {
		return nomeQuadra;
	}

	public void setNomeQuadra(String nomeQuadra) {
		this.nomeQuadra = nomeQuadra;
	}
	
}
