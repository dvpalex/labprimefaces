package br.com.ninb.labprimefaces.dal;

import javax.persistence.EntityManager;

public class TipoTarefaParamDal extends GenericDal<String, TipoTarefaParamDal> {

	public TipoTarefaParamDal(EntityManager entityManager) {
		super(entityManager);
		
	}

}
