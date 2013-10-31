package br.com.ninb.labprimefaces.model.dao;

import javax.persistence.EntityManager;

import br.com.ninb.labprimefaces.model.entities.WorkFlow;

public class WorkFlowDao extends Dao<Integer, WorkFlow> {

	public WorkFlowDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
