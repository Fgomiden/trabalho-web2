package br.ufrrj.web2.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoPaciente")
public class NovoPacienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("Cadastrando novo paciente");
		 
	     String nomePaciente = request.getParameter("nome");
	     String nomeResponsavel = request.getParameter("nomeResponsavel");
	     String dentistaResponsavel = request.getParameter("dentistaResponsavel");
	     
	     String cpfPaciente = request.getParameter("cpf");
	     String emailPaciente = request.getParameter("email");
	    // Calendar dataPaciente = request.getParameter("dataNasc");
	     String senhaPaciente = request.getParameter("senha");
	     String telefone = request.getParameter("telefone");
	     String celular = request.getParameter("celular");
	     String endereco = request.getParameter("endereco");
	     String numero = request.getParameter("numero");
	     String complemento = request.getParameter("complemento");
	     String cep = request.getParameter("cep");
	     
	     Paciente paciente = new Paciente();
	     paciente.setNome(nomePaciente);
		 paciente.setNomeResponsavel(nomeResponsavel);	
		 paciente.setCpfPassport(cpfPaciente);
		 paciente.setEmail(emailPaciente);
		// paciente.setDataNasc(dataPaciente);
		 paciente.setSenha(senhaPaciente);
		 paciente.setTelefone(telefone);
		 paciente.setCelular(celular);
		 paciente.setEndereco(endereco);
		 paciente.setNumero(numero);
		 paciente.setComplemento(complemento);
		 paciente.setCep(cep);
		 //Tipo do setDentistaResponsavel é Profissional
		 Profissional profissional = new Profissional();
		 profissional.setNome(dentistaResponsavel);
		 paciente.setDentistaResponsavel(profissional);
		 
		 
	     
	     PrintWriter out = response.getWriter();
	     out.println("<html><body>Paciente "+ nomePaciente + dentistaResponsavel + nomeResponsavel + cpfPaciente + emailPaciente +" cadastrado com sucesso!</body></html>");
	}
}
