package br.com.ninb.labprimefaces.model.dao;

import javax.persistence.EntityManager;
import br.com.ninb.labprimefaces.model.entities.Tarefa;


public class TarefaDao extends Dao<Integer, Tarefa> {

	public TarefaDao(EntityManager entityManager) {
		super(entityManager);

	}

}
