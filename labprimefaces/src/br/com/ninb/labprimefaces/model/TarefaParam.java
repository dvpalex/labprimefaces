package br.com.ninb.labprimefaces.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="oper_tarefaparam")
public class TarefaParam implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public TarefaParam(){
	}
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(optional=false, fetch = FetchType.LAZY)
	@JoinColumn(name="idtarefa", referencedColumnName="id")
	private Tarefa tarefa;
	
	@ManyToOne(optional=false,  fetch = FetchType.LAZY)
	@JoinColumn(name="idtipotarefaparam", referencedColumnName="nome")
	private TipoTarefaParam tipoTarefaParam;
	
	@Column(length=4000)
	private String valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public TipoTarefaParam getTipoTarefaParam() {
		return tipoTarefaParam;
	}

	public void setTipoTarefaParam(TipoTarefaParam tipoTarefaParam) {
		this.tipoTarefaParam = tipoTarefaParam;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (!(obj instanceof TarefaParam)) {
			return false;
		}
		TarefaParam other = (TarefaParam) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
}
