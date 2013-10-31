package br.com.ninb.labprimefaces.model.entities;

import java.io.Serializable;
import java.lang.reflect.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="oper_tipotarefaparam")
public class TipoTarefaParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public TipoTarefaParam(){}
	
	@OneToMany(fetch = FetchType.LAZY)
	private TipoTarefa tipotarefa;
	
	@Id
	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(length=4000)
	private String valorDedfault;
	
	@Column
	private Boolean obrigatorio;
	
	@Column(nullable=false)
	private Type tipo;
	
	@Column
	private Boolean unico;
	
	@Column(length=4000)
	private String dominio;
	
	@Column
	private Boolean dominioUnico;
	
	@Column
	private Boolean propagar;

	
	@Column
	private Boolean ativo;
	
	
	public Boolean getAtivo() {
		return ativo;
	}


	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public TipoTarefa getTipotarefa() {
		return tipotarefa;
	}

	public void setTipotarefa(TipoTarefa tipotarefa) {
		this.tipotarefa = tipotarefa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValorDedfault() {
		return valorDedfault;
	}

	public void setValorDedfault(String valorDedfault) {
		this.valorDedfault = valorDedfault;
	}

	public Boolean getObrigatorio() {
		return obrigatorio;
	}

	public void setObrigatorio(Boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}

	public Type getTipo() {
		return tipo;
	}

	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}

	public Boolean getUnico() {
		return unico;
	}

	public void setUnico(Boolean unico) {
		this.unico = unico;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public Boolean getDominioUnico() {
		return dominioUnico;
	}

	public void setDominioUnico(Boolean dominioUnico) {
		this.dominioUnico = dominioUnico;
	}

	public Boolean getPropagar() {
		return propagar;
	}

	public void setPropagar(Boolean propagar) {
		this.propagar = propagar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		
		if (!(obj instanceof TipoTarefaParam)) {
			return false;
		}
		
		TipoTarefaParam other = (TipoTarefaParam) obj;
		
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
