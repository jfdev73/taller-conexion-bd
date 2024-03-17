package com.miranda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDBC implements ConexionBD {

	private static ConexionJDBC instance;
	private Connection conn;

	private ConexionJDBC() {
	}

	public static synchronized ConexionJDBC getInstance() {
		if (instance == null) {
			instance = new ConexionJDBC();

		}
		return instance;
	}

	@Override
	public Connection getConnection() throws SQLException {
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	@Override
	public void closeConnection() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
