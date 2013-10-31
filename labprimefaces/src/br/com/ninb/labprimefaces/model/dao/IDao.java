package br.com.ninb.labprimefaces.model.dao;

import java.util.List;

public interface IDao <PK, T> {

	T getByID(Class<T> classe, PK pk);
	void save(T entity);
	void update(T entity);
	void delete(T entity);
	List<T> listAll();
	
}
