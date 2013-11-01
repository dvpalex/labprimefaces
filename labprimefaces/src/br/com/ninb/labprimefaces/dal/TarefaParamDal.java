package br.com.ninb.labprimefaces.dal;

import javax.persistence.EntityManager;

import br.com.ninb.labprimefaces.model.TarefaParam;

public class TarefaParamDal extends GenericDal<Integer, TarefaParam> {

	public TarefaParamDal(EntityManager entityManager) {
		super(entityManager);
		
	}

}
