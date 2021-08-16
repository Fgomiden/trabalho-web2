package br.ufrrj.web2.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FazerLoginServlet
 */
@WebServlet("/fazerLogin")
public class FazerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailUsuario = request.getParameter("email");
		String senhaUsuario = request.getParameter("senha");
		String opcaoLogin = request.getParameter("opcao");
		
		Usuario usuario = new Usuario();
		usuario.setNome(emailUsuario);
		usuario.setSenha(senhaUsuario);
		
		if( opcaoLogin.equals("paciente")) {
			response.setContentType("text/html"); 
			response.sendRedirect("painel-paciente.html");
		} else if(opcaoLogin.equals("profissional")){	
			response.setContentType("text/html"); 
			response.sendRedirect("painel-profissional.html");
		} else {
			System.out.println("Deu ruim");
		}
		
	}

}
