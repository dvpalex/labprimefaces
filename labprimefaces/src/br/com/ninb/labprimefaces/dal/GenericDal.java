package br.com.ninb.labprimefaces.dal;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class GenericDal<PK, T> implements IGenericDal<PK , T>{

	private EntityManager entityManager;
	
	public GenericDal(EntityManager entityManager){
		this.entityManager = entityManager;
		
	}
	
	
	@Override
	public T getByID(Class<T> classe, PK pk) {
		
		return entityManager.find(classe, pk);
	}

	@Override
	public void save(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	}

	@Override
	public void update(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
	}

	@Override
	public void delete(T entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		
		T classe =null;
		return entityManager.createQuery("FROM " + classe.getClass().getName()).getResultList();
	}

	
	
	
}
