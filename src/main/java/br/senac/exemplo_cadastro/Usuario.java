package br.senac.exemplo_cadastro;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String celular;
	private String documento;
	private int idEndereco;
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}

}
