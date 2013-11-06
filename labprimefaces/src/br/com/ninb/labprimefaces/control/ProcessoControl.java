package br.com.ninb.labprimefaces.control;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

import br.com.ninb.labprimefaces.model.Processo;
import br.com.ninb.labprimefaces.service.ProcessoService;


@ManagedBean
@ViewScoped
public class ProcessoControl {

	@EJB
	private ProcessoService service;
	
	
	private int id = 459895;
	private List<Processo> processos;
	private Processo processo;


	public ProcessoControl(){
		
	}
	
	
	public ProcessoService getService() {
		return service;
	}

	public void setService(ProcessoService service) {
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	
	public void inserirProcesso(){
		
		System.out.print("Incluido");
	}
	
}
