package com.ricardolemes.curriculo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolemes.curriculo.domain.Candidato;
import com.ricardolemes.curriculo.exception.ObjectNotFoundException;
import com.ricardolemes.curriculo.repositories.CandidatoRepository;


@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository repo;

	public List<Candidato> findAll() {
		return repo.findAll();
	}
	

	public Candidato buscar(Integer id) {
		
		Optional<Candidato> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ",Tipo"+ Candidato.class.getName()));

	}

}
