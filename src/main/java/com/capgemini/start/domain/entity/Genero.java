package com.capgemini.start.domain.entity;

import java.util.Date;

public class Genero {
	
	private Long id;
	
	private String descricao;
	
	private Date dataIncusao;
	
	private Date dataAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataIncusao() {
		return dataIncusao;
	}

	public void setDataIncusao(Date dataIncusao) {
		this.dataIncusao = dataIncusao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	

}
