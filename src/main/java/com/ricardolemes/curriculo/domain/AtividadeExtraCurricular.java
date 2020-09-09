package com.ricardolemes.curriculo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AtividadeExtraCurricular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer CargaHoraria;
	private String nomeInstituicao;
	private Date DtInicial;
	private Date DtFinal;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "candidato_id")
	private Candidato candidato;

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public AtividadeExtraCurricular() {

	}

	public AtividadeExtraCurricular(Integer id, String nome, Integer cargaHoraria, String nomeInstituicao,
			Date dtInicial, Date dtFinal, Candidato candidato) {
		super();
		this.id = id;
		this.nome = nome;
		this.CargaHoraria = cargaHoraria;
		this.nomeInstituicao = nomeInstituicao;
		DtInicial = dtInicial;
		DtFinal = dtFinal;
		this.candidato = candidato;
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

	public Integer getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public Date getDtInicial() {
		return DtInicial;
	}

	public void setDtInicial(Date dtInicial) {
		DtInicial = dtInicial;
	}

	public Date getDtFinal() {
		return DtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		DtFinal = dtFinal;
	}

}
