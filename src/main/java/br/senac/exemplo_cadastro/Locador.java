package br.senac.exemplo_cadastro;

public class Locador {
	
	private int id;
	private String nome;
	private String email;
	private String celular;
	private String documento_cnpj;
	private String documento_cpf;

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getDocumentoCNPJ() {
		return documento_cnpj;
	}
	
	public void setDocumentoCNPJ(String documento_cnpj) {
		this.documento_cnpj = documento_cnpj;
	}
	
	public String getDocumentoCPF() {
		return documento_cpf;
	}
	
	public void setDocumentoCPF(String documento_cpf) {
		this.documento_cpf = documento_cpf;
	}
	

}
