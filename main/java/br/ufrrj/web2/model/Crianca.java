package br.ufrrj.web2.model;

import java.util.List;

public class Crianca extends Usuario{
//	private Integer id crianca;
	private Usuario responsavel;
	private Usuario dentistaResponsavel;
//	private Prontuario prontuario;
	private Avatar avatar;
	//private List<Resposta> respostas;
	private List<Atendimento> atendimentos;
		

	public Usuario getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}	

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public Usuario getDentistaResponsavel() {
		return dentistaResponsavel;
	}

	public void setDentistaResponsavel(Usuario dentistaResponsavel) {
		this.dentistaResponsavel = dentistaResponsavel;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
		
}
