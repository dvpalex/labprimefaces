package br.com.ninb.labprimefaces.model.dao;

import javax.persistence.EntityManager;

public class TipoTarefaDao extends Dao<Integer, TipoTarefaDao> {

	public TipoTarefaDao(EntityManager entityManager) {
		super(entityManager);
		
	}

}
