package br.ufrrj.web2.model;

import java.util.Calendar;

public class Usuario {
	// private Integer id;
	private String nome;
	private String cpfPassport;
	private String email;
	private Calendar dataNasc;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfPassport() {
		return cpfPassport;
	}
	public void setCpfPassport(String cpfPassport) {
		this.cpfPassport = cpfPassport;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
