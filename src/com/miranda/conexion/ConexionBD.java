package com.miranda.conexion;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConexionBD {
	 String url = "jdbc:postgresql://localhost:5432/conexionBd";
	 String user = "postgres";
	 String password = "1234";
	public Connection getConnection() throws SQLException;
	 public void closeConnection();
}
