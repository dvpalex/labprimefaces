package br.com.ninb.labprimefaces.model.dao;

import javax.persistence.EntityManager;

import br.com.ninb.labprimefaces.model.entities.TarefaParam;

public class TarefaParamDao extends Dao<Integer, TarefaParam> {

	public TarefaParamDao(EntityManager entityManager) {
		super(entityManager);
		
	}

}
