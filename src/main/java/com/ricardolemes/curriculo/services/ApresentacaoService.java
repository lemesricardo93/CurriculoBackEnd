package com.ricardolemes.curriculo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolemes.curriculo.domain.Apresentacao;
import com.ricardolemes.curriculo.exception.ObjectNotFoundException;
import com.ricardolemes.curriculo.repositories.ApresentacaoRepository;

@Service
public class ApresentacaoService {

	@Autowired
	private ApresentacaoRepository repo;

	public List<Apresentacao> findAll() {
		return repo.findAll();
	}

	public Apresentacao buscar(Integer id) {

		Optional<Apresentacao> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ",Tipo" + Apresentacao.class.getName()));

	}
}
