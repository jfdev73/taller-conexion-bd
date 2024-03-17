package com.miranda.service;

import java.util.List;

public interface GenericService<T, ID> {

	List<T> findAll();

	void save(T t);

	T findById(ID id);

	void delete(ID id);

}
