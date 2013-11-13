package br.com.ninb.labprimefaces.service;

 

import br.com.ninb.labprimefaces.dal.ProcessoDal;
import br.com.ninb.labprimefaces.model.Processo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProcessoService {
	
	@Autowired
	private ProcessoDal dal;
	

	public void adicionar(Processo obj) throws IllegalArgumentException{
		
		dal.save(obj);
	}
	
	
	
	
}
