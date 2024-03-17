package com.miranda.repository;

import java.sql.SQLException;
import java.util.List;

public interface GenericRepository <T, ID>{
	
	List<T> findAll() throws SQLException;
	
	void save(T t);
	
	T findById(ID id);
	
	void delete(ID id);

}
