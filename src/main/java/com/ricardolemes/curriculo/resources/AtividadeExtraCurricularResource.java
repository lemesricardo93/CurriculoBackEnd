package com.ricardolemes.curriculo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardolemes.curriculo.domain.AtividadeExtraCurricular;
import com.ricardolemes.curriculo.dto.AtividadeExtraCurricularDTO;
import com.ricardolemes.curriculo.services.AtividadeExtraCurricularService;

@RestController
@RequestMapping(value = "/atividades")
public class AtividadeExtraCurricularResource {

	@Autowired
	private AtividadeExtraCurricularService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<AtividadeExtraCurricularDTO>> findAll() {
		List<AtividadeExtraCurricular> list = service.findAll();
		List<AtividadeExtraCurricularDTO> listDto = list.stream().map(obj -> new AtividadeExtraCurricularDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		AtividadeExtraCurricular obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
