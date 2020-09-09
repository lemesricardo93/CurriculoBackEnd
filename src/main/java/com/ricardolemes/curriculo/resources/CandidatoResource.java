package com.ricardolemes.curriculo.resources;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardolemes.curriculo.domain.Candidato;
import com.ricardolemes.curriculo.dto.CandidatoDTO;
import com.ricardolemes.curriculo.services.CandidatoService;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoResource {

	@Autowired
	private CandidatoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CandidatoDTO>> findAll() {
		List<Candidato> list = service.findAll();
		List<CandidatoDTO> listDto = list.stream().map(obj -> new CandidatoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Candidato obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
