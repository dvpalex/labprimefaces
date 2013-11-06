package br.com.ninb.labprimefaces.service;

 

import br.com.ninb.labprimefaces.dal.ProcessoDal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProcessoService {
	
	@PersistenceContext
	private EntityManager em;
	
	
	protected EntityManager getEntityManager(){
		return em;
	}

	
	public ProcessoService(ProcessoDal dal){
		dal.setEntityManager(getEntityManager());
	}
	
	
	
	
}
