package br.ufrrj.web2.model;

//A partir dos 28 min do video web-2 modelo de projeto
//é discutido sobre como fazer o avatar

public class Avatar {
//	private Integer id;
	private String corAvatar;
	private String olhosAvatar;
	private String roupa;
	private String calcado;
	private String cabelo;
	
	private Crianca crianca;

	public String getCorAvatar() {
		return corAvatar;
	}

	public void setCorAvatar(String corAvatar) {
		this.corAvatar = corAvatar;
	}

	public String getOlhosAvatar() {
		return olhosAvatar;
	}

	public void setOlhosAvatar(String olhosAvatar) {
		this.olhosAvatar = olhosAvatar;
	}

	public String getRoupa() {
		return roupa;
	}

	public void setRoupa(String roupa) {
		this.roupa = roupa;
	}

	public String getCalcado() {
		return calcado;
	}

	public void setCalcado(String calcado) {
		this.calcado = calcado;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}

	public Crianca getCrianca() {
		return crianca;
	}

	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}
	
	
}
