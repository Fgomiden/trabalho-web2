package br.ufrrj.web2.model;

import java.util.List;

//Criei essa classe sendo uma junção das classes Crianca e Responsavel
public class Paciente extends Usuario{
	private String nomeResponsavel;
	private Profissional dentistaResponsavel;
	private String telefone;
	private String celular;
	private String endereco;
	private String numero;
	private String complemento;
	private String cep;
	private Avatar avatar;
	private List<Atendimento> atendimentos;
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public Profissional getDentistaResponsavel() {
		return dentistaResponsavel;
	}
	public void setDentistaResponsavel(Profissional dentistaResponsavel) {
		this.dentistaResponsavel = dentistaResponsavel;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public Avatar getAvatar() {
		return avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
}
