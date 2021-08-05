package br.ufrrj.web2.model;

import java.util.List;

public class Responsavel extends Usuario{
//	private Integer id responsavel;
	
	private List<Crianca> criancas;
	private String fone1;
	private String fone2;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	
	public List<Crianca> getCriancas() {
		return criancas;
	}
	public void setCriancas(List<Crianca> criancas) {
		this.criancas = criancas;
	}
	public String getFone1() {
		return fone1;
	}
	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}
	public String getFone2() {
		return fone2;
	}
	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
