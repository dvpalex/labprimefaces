package br.com.ninb.labprimefaces.model.dao;

import javax.persistence.EntityManager;

public class TipoTarefaParamDao extends Dao<String, TipoTarefaParamDao> {

	public TipoTarefaParamDao(EntityManager entityManager) {
		super(entityManager);
		
	}

}
