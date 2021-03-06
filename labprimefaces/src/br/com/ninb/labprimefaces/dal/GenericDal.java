package br.com.ninb.labprimefaces.dal;


import java.util.List;




import javassist.expr.Instanceof;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDal<PK, T> {

	@PersistenceContext
	private EntityManager entityManager;
	
	public GenericDal(){
	}
	
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}



	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	public T getByID(Class<T> classe, PK pk) {
		
		return entityManager.find(classe, pk);
	}

	
	public void save(T entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
	}

	
	public void update(T entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
	}

	
	public void delete(T entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	
	public List<T> listAll() {
		
		T classe =null;
		return entityManager.createQuery("FROM ").getResultList();
	}
	
}
