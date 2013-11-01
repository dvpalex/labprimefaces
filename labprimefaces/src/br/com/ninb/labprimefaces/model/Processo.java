package br.com.ninb.labprimefaces.model;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="oper_processo")
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(nullable=false)
	private Integer id;
	
	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(nullable=false)
	private Date dtaInc;
	
	@OneToMany(mappedBy="processo", fetch = FetchType.LAZY)
	private List<WorkFlow> workFlow;

	
	public List<WorkFlow> getWorkFlow() {
		return workFlow;
	}

	public void setWorkFlow(List<WorkFlow> workFlow) {
		this.workFlow = workFlow;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtaInc() {
		return dtaInc;
	}

	public void setDtaInc(Date dtaInc) {
		this.dtaInc = dtaInc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		if (!(obj instanceof Processo)) {
			return false;
		}
		Processo other = (Processo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
	
}
