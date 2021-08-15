package br.ufrrj.web2.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufrrj.web2.model.Paciente;

public class PacienteDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/trab-web?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "gomide";
	
	//private static final 
	String INSERT_USERS_SQL = "INSERT INTO pacientes" 
			+ "  (nome, nomeResponsavel) VALUES "
			+ " (?, ?, ?);";
	//private static final String SELECT_USER_BY_ID = "select id,nome,nomeResponsavel from pacientes where id =?";
	//private static final String SELECT_ALL_USERS = "select * from pacientes";
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void inserirPaciente(Paciente paciente) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, paciente.getNome());
			preparedStatement.setString(2, paciente.getNomeResponsavel());
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
	 
	
}
