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
		String nomeUsuario = request.getParameter("nome");
		String senhaUsuario = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setNome(nomeUsuario);
		usuario.setSenha(senhaUsuario);
		
		response.setContentType("text/html"); 	
		
		//if(paciente) {
			response.sendRedirect("painel-paciente.html");
		//} else {			
			//response.sendRedirect("painel-profissional.html");
		//}
		
	}

}
