package br.com.ninb.labprimefaces.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="oper_tarefa")
public class Tarefa implements Serializable{

	
	private static final long serialVersionUID = 1L;

	public  Tarefa(){
		
	}
	
	@Id
	@GeneratedValue
	@Column(nullable=false)
	private Integer id;
	
	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtaInc;
	
	@Column(nullable=false)
	private Integer status;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtipotarefa", referencedColumnName ="id")
	private TipoTarefa tipoTarefa;
	
	@OneToOne(optional=false)
	private WorkFlow workFlow;
	
	
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public int hashCode(){
		int hash = 7;
		hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == null){
			return false;
		}
		
		if(getClass() != obj.getClass()){
			return false;
		}
		
		final Tarefa obj1 = (Tarefa)obj;
		
		if(this.id != obj1.getId() && (this.id == null || !this.id.equals(obj1.getId()))){
			return false;
		}
		
		return true;
	
	}
	
	
}
