package com.miranda.conexion;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionPoolJDBC {
	private static final String url = "jdbc:postgresql://localhost:5432/conexionBd";
	private static final String user = "postgres";
	private static final String password = "1234";

	private static BasicDataSource pool;

	public static BasicDataSource getInstance() throws SQLException {
		if (pool == null) {
			pool = new BasicDataSource();
			pool.setUrl(url);
			pool.setUsername(user);
			pool.setPassword(password);
			/* Tamaño inicial de conexiones abiertas -> indicamos que empiece con 3 */
			pool.setInitialSize(3);
			/* Minimo de conexiones inactivas que estan esperando para ser utilziada */
			pool.setMinIdle(8);
			/* Maximo de conexiones inactivas e activas */
			pool.setMaxIdle(8);

		}
		return pool;
	}

	public static Connection getConnection() throws SQLException {
		return getInstance().getConnection();
	}

}
