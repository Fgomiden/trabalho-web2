package br.ufrrj.web2.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoProfissionalServlet
 */
@WebServlet("/novoProfissional")
public class NovoProfissionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo profissional");
		 
	     String nomePaciente = request.getParameter("nome");
	    	     
	     String cpfProfissional = request.getParameter("cpfPassport");
	     String emailProfissional = request.getParameter("email");
	    // Calendar dataProfissional = request.getParameter("dataNasc");
	     String senhaProfissional = request.getParameter("senha");
	     String matriculaProfissional = request.getParameter("matriculaCRO");
	     
	     Profissional profissional = new Profissional();
	     profissional.setNome(nomePaciente);
	     profissional.setCpfPassport(cpfProfissional);
	     profissional.setEmail(emailProfissional);
		// paciente.setDataNasc(dataProfissional);
	     profissional.setSenha(senhaProfissional);
	     profissional.setSenha(matriculaProfissional);
		 
		 		 
		 //request.setAttribute("paciente", paciente.getNome());
		 
		 //PrintWriter out = response.getWriter();
		 //out.println("<html><body>Profissional "+ nomePaciente + cpfProfissional + matriculaProfissional +" cadastrado com sucesso!</body></html>");
		 
		 response.setContentType("text/html"); 	
		 response.sendRedirect("login.html");
		 
	}

}
