package aula24.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula24JDBC {
	private final String url = "jdbc:postgresql://database-1.cvitjixrebr2.us-east-1.rds.amazonaws.com/db_thais";
	private final String user = "thais";
	private final String password = "thais2021!";
	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public Connection connect() throws Exception {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			if (conn == null) {
				throw new Exception();
			}

			ClienteDAO clienteDAO = new ClienteDAO();
			int codigoCliente = clienteDAO.criaNovoCliente("Armando da Silva", "12345612345", "8528529", 6000f,
					"1933205858", "armando-silva8596@hotmail.com", conn);

			ContaDAO contaDAO = new ContaDAO();
			String numeroConta = contaDAO.criaNovaConta(codigoCliente, "4000", conn);
			
			System.out.println(numeroConta);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public static void main(String[] args) throws Exception {
		Aula24JDBC app = new Aula24JDBC();
		app.connect();
	}

}