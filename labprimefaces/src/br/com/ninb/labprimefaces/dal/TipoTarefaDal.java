package br.com.ninb.labprimefaces.dal;

import javax.persistence.EntityManager;

public class TipoTarefaDal extends GenericDal<Integer, TipoTarefaDal> {

	public TipoTarefaDal(EntityManager entityManager) {
		super(entityManager);
		
	}

}
