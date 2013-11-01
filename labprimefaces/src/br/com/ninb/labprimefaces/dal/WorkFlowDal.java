package br.com.ninb.labprimefaces.dal;

import javax.persistence.EntityManager;

import br.com.ninb.labprimefaces.model.WorkFlow;

public class WorkFlowDal extends GenericDal<Integer, WorkFlow> {

	public WorkFlowDal(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
