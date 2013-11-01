package br.com.ninb.labprimefaces.dal;

import javax.persistence.EntityManager;

import br.com.ninb.labprimefaces.model.Processo;

public class ProcessoDal extends GenericDal<Integer, Processo> {

	
	public ProcessoDal(EntityManager entityManager) {
		super(entityManager);

		
		
		
	}

}
