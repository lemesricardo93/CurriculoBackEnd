package com.ricardolemes.curriculo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.ricardolemes.curriculo.domain.Apresentacao;

public class ApresentacaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String nome;
	

	public ApresentacaoDTO() {

	}

	public ApresentacaoDTO(Apresentacao obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getAbertura();
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

	
}
