package com.miranda.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.miranda.conexion.ConexionBD;
import com.miranda.conexion.ConexionJDBC;
import com.miranda.entity.Usuario;

public class UsuarioRepositoryJDBC implements GenericRepository<Usuario, Integer> {

	private ConexionBD conexion = ConexionJDBC.getInstance();

	private Connection getConnection() throws SQLException {
		
		return conexion.getConnection();
	}

	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuarios = new LinkedList<>();
		String sql = "SELECT * from usuario";

		try (
				Statement st = getConnection().createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			while (rs.next()) {
				Usuario u = getUsuario(rs);
				usuarios.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			conexion.closeConnection();
		}

		return usuarios;
	}

	private Usuario getUsuario(ResultSet rs) throws SQLException {
		Usuario u = new Usuario();
		u.setId(rs.getInt(1));
		u.setUsuario(rs.getString(2));
		u.setPassword(rs.getString(3));
		return u;
	}

	@Override
	public void save(Usuario t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario findById(Integer id) {
		String sql = "SELECT * from usuario WHERE id =?";
		Usuario u = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				 u = getUsuario(rs);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
