package br.ufrrj.web2.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnviarRespostasServlet
 */
@WebServlet("/EnviarRespostasServlet")
public class EnviarRespostasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String r1 = request.getParameter("");
		
		
		

		 //PrintWriter out = response.getWriter();
		 //out.println("<html><body>Respostas enviadas com sucesso!</body></html>");
		 
		 //response.setContentType("text/html"); 	
		 //response.sendRedirect("painel-paciente.html");	
	}

}
