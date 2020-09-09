package com.ricardolemes.curriculo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolemes.curriculo.domain.AtividadeExtraCurricular;
import com.ricardolemes.curriculo.exception.ObjectNotFoundException;
import com.ricardolemes.curriculo.repositories.AtividadeExtraCurricularRepository;

@Service
public class AtividadeExtraCurricularService {

	@Autowired
	private AtividadeExtraCurricularRepository repo;

	public List<AtividadeExtraCurricular> findAll() {
		return repo.findAll();
	}

	public AtividadeExtraCurricular buscar(Integer id) {

		Optional<AtividadeExtraCurricular> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ",Tipo" + AtividadeExtraCurricular.class.getName()));

	}
}
