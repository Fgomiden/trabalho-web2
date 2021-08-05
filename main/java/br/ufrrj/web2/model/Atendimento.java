package br.ufrrj.web2.model;

import java.util.Calendar;
import java.util.List;

public class Atendimento {

	private Usuario crianca;
	private Usuario profissionalAtendimento;
	private String procedimento;
	private Calendar dataAtendimento;
	//no video modelo de projeto as 01:11:40 explica as respostas
	//r1=[-1,-1,-1,..] -> r1=[1,0,1,...]
	private List<Integer> respostasAntes;
	private List<Integer> respostasDepois;
	
	public Usuario getCrianca() {
		return crianca;
	}
	public void setCrianca(Usuario crianca) {
		this.crianca = crianca;
	}
	public Usuario getProfissionalAtendimento() {
		return profissionalAtendimento;
	}
	public void setProfissionalAtendimento(Usuario profissionalAtendimento) {
		this.profissionalAtendimento = profissionalAtendimento;
	}
	public String getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}
	public Calendar getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Calendar dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public List<Integer> getRespostasAntes() {
		return respostasAntes;
	}
	public void setRespostasAntes(List<Integer> respostasAntes) {
		this.respostasAntes = respostasAntes;
	}
	public List<Integer> getRespostasDepois() {
		return respostasDepois;
	}
	public void setRespostasDepois(List<Integer> respostasDepois) {
		this.respostasDepois = respostasDepois;
	}
	
	
}
