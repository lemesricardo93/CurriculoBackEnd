package com.ricardolemes.curriculo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@Column(unique = true)
	private String email;
	
	private String estadoCivil;

	private String cpfouPj;
	private Date dtNascimento;
	private String Endereco;
	@ElementCollection
	@CollectionTable(name = "TELEFONE")
	private Set<String> telefones = new HashSet<>();
	
	@OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL)
	private List<AtividadeExtraCurricular> atvExtraCurriculars = new ArrayList<>();
	public Candidato() {

	}	

	

	
	public Candidato(Integer id, String nome, String email, String cpfouPj, Date dtNascimento, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfouPj = cpfouPj;
		this.dtNascimento = dtNascimento;
		Endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public List<AtividadeExtraCurricular> getAtvExtraCurriculars() {
		return atvExtraCurriculars;
	}

	public void setAtvExtraCurriculars(List<AtividadeExtraCurricular> atvExtraCurriculars) {
		this.atvExtraCurriculars = atvExtraCurriculars;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfouPj() {
		return cpfouPj;
	}

	public void setCpfouPj(String cpfouPj) {
		this.cpfouPj = cpfouPj;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDt_nascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

}
