package br.ufrrj.web2.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrrj.web2.model.ConectarBanco;

/**
 * Servlet implementation class NovoProfissionalServlet
 */
@WebServlet("/novoProfissional")
public class NovoProfissionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo profissional");
		 
	     String nomeProfissional = request.getParameter("nome");	    	     
	     String cpfProfissional = request.getParameter("cpfPassport");
	     String emailProfissional = request.getParameter("email");
	     String dataProfissional = request.getParameter("dataNasc");
	     String senhaProfissional = request.getParameter("senha");
	     String matriculaProfissional = request.getParameter("matriculaCRO");
	     
	     try {
	            
	            Connection con = ConectarBanco.initializeDatabase();
	  
	            PreparedStatement st = con
	                   .prepareStatement("insert into profissionais (nome, cpf, email, dataNasc, senha, cro) values(?, ?, ?, ?, ?, ?)");
	  
	            
	            st.setString(1, nomeProfissional);
	            st.setString(2, cpfProfissional);
	            st.setString(3, emailProfissional);
	            st.setString(4, dataProfissional);
	            st.setString(5, senhaProfissional);
	            st.setString(6, matriculaProfissional);
	            
	            st.executeUpdate();
	  
	            st.close();
	            con.close();
	  
	            System.out.println("Cadastrado novo profissional com sucesso");
	            
	            response.setContentType("text/html"); 	
	   		 	response.sendRedirect("login.html");
	            
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
		 		 
		 //request.setAttribute("paciente", paciente.getNome());
		 
		 //PrintWriter out = response.getWriter();
		 //out.println("<html><body>Profissional "+ nomePaciente + cpfProfissional + matriculaProfissional +" cadastrado com sucesso!</body></html>");
		 
		
		 
	}

}
