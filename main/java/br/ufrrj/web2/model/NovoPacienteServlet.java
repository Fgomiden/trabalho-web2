package br.ufrrj.web2.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
	     String sexoPaciente = request.getParameter("sexo");
	     String cpfPaciente = request.getParameter("cpfPassport");
	     String emailPaciente = request.getParameter("email");
	     String dataPaciente = request.getParameter("dataNasc");
	     String senhaPaciente = request.getParameter("senha");
	     String telefone = request.getParameter("telefone");
	     String celular = request.getParameter("celular");
	     String endereco = request.getParameter("endereco");
	     String numero = request.getParameter("numero");
	     String complemento = request.getParameter("complemento");
	     String cep = request.getParameter("cep");     
	    
		 try {
	            
	       Connection con = ConectarBanco.initializeDatabase();
	  
	       PreparedStatement st = con
	       .prepareStatement("insert into pacientes (nome, nomeResponsavel, dentistaResponsavel, sexo, cpf, email, dataNasc, "
	       		+ "senha, telefone, celular, endereco, numero, complemento, cep) "
	       		+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	  
	            
	            st.setString(1, nomePaciente);
	            st.setString(2, nomeResponsavel);
	            st.setString(3, dentistaResponsavel);
	            st.setString(4, sexoPaciente);
	            st.setString(5, cpfPaciente);
	            st.setString(6, emailPaciente);
	            st.setString(7, dataPaciente);
	            st.setString(8, senhaPaciente);
	            st.setString(9, telefone);
	            st.setString(10, celular);
	            st.setString(11, endereco);
	            st.setString(12, numero);
	            st.setString(13, complemento);
	            st.setString(14, cep);
	            
	            st.executeUpdate();
	  
	            st.close();
	            con.close();
	  
	            System.out.println("Cadastrado novo paciente com sucesso");
	            
	            response.setContentType("text/html"); 	
	   		 	response.sendRedirect("login.html");
	            
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }	 
	}
}
