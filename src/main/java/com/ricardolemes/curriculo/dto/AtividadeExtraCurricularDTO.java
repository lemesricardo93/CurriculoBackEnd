package com.ricardolemes.curriculo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.ricardolemes.curriculo.domain.AtividadeExtraCurricular;

public class AtividadeExtraCurricularDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String nome;
	private Date dtInicial;
	private Date dtFinal;

	public AtividadeExtraCurricularDTO() {

	}

	public AtividadeExtraCurricularDTO(AtividadeExtraCurricular obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.dtInicial = obj.getDtInicial();
		this.dtFinal = obj.getDtFinal();

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

	public Date getDtInicial() {
		return dtInicial;
	}

	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	
}
