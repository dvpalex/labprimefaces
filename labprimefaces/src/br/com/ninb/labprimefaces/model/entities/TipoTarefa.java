package br.com.ninb.labprimefaces.model.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="oper_tipotarefa")
public class TipoTarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public TipoTarefa(){
		
	}
	
	@Id
	@GeneratedValue
	@Column(nullable=false)
	private Integer id;

	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(nullable=false)
	private Date dtaInc;
	
	
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
		
		final TipoTarefa obj1 = (TipoTarefa)obj;
		
		if(this.id != obj1.getId() && (this.id == null || !this.id.equals(obj1.getId()))){
			return false;
		}
		
		return true;
	
	}
	
	
	
}
