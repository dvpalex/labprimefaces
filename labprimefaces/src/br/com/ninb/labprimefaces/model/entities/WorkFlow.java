package br.com.ninb.labprimefaces.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="oper_workflow")
public class WorkFlow implements Serializable {

	private static final long serialVersionUID = 1L;

	public WorkFlow(){}

	
	@Id
	@GeneratedValue
	@Column(nullable=false)
	private int id;
	
	@Column(nullable=false)
	private Date dtaInc;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idprocesso", referencedColumnName="id")
	private Processo processo; 
	
	@OneToOne(fetch = FetchType.LAZY)
	private WorkFlow parent;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idtarefa", referencedColumnName="id")
	private Tarefa tarefa;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDtaInc() {
		return dtaInc;
	}


	public void setDtaInc(Date dtaInc) {
		this.dtaInc = dtaInc;
	}


	public Processo getProcesso() {
		return processo;
	}


	public void setProcesso(Processo processo) {
		this.processo = processo;
	}


	public WorkFlow getParent() {
		return parent;
	}


	public void setParent(WorkFlow parent) {
		this.parent = parent;
	}

	
	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtaInc == null) ? 0 : dtaInc.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((processo == null) ? 0 : processo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof WorkFlow)) {
			return false;
		}
		WorkFlow other = (WorkFlow) obj;
		if (dtaInc == null) {
			if (other.dtaInc != null) {
				return false;
			}
		} else if (!dtaInc.equals(other.dtaInc)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (processo == null) {
			if (other.processo != null) {
				return false;
			}
		} else if (!processo.equals(other.processo)) {
			return false;
		}
		return true;
	}
	
}
