package br.ufrrj.web2.model;

import java.util.List;

public class Profissional extends Usuario{
	
	private String matriculaCRO;
	private List<Atendimento> atendimentos;

	public String getMatriculaCRO() {
		return matriculaCRO;
	}

	public void setMatriculaCRO(String matriculaCRO) {
		this.matriculaCRO = matriculaCRO;
	}
	
	
	
	
//	private Integer idProfissional;
//	private Usuario profissionalResponsavel; //ex: professor
//	private Usuario supervisor; //aluno de pós grad
//	private Usuario aluno; //quem atendeu
//	private Usuario alunoAuxiliar; //quem ajudou no atendimento
//	
//	public Usuario getProfissionalResponsavel() {
//		return profissionalResponsavel;
//	}
//	public void setProfissionalResponsavel(Usuario profissionalResponsavel) {
//		this.profissionalResponsavel = profissionalResponsavel;
//	}
//	public Usuario getSupervisor() {
//		return supervisor;
//	}
//	public void setSupervisor(Usuario supervisor) {
//		this.supervisor = supervisor;
//	}
//	public Usuario getAluno() {
//		return aluno;
//	}
//	public void setAluno(Usuario aluno) {
//		this.aluno = aluno;
//	}
//	public Usuario getAlunoAuxiliar() {
//		return alunoAuxiliar;
//	}
//	public void setAlunoAuxiliar(Usuario alunoAuxiliar) {
//		this.alunoAuxiliar = alunoAuxiliar;
//	}

	
}
