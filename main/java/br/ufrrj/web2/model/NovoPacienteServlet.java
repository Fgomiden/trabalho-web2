package br.ufrrj.web2.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoPacienteServlet
 */
@WebServlet("/novoPaciente")
public class NovoPacienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("Cadastrando novo paciente");
	        String nomePaciente = request.getParameter("nome");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>Paciente " + nomePaciente + " cadastrado com sucesso!</body></html>");
	}
}
