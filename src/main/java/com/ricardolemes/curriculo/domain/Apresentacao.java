package com.ricardolemes.curriculo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apresentacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Abertura;

	public Apresentacao() {

	}

	public Apresentacao(Integer id, String abertura) {
		super();
		this.id = id;
		Abertura = abertura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbertura() {
		return Abertura;
	}

	public void setAbertura(String abertura) {
		Abertura = abertura;
	}

}
