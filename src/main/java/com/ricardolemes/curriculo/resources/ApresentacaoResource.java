package com.ricardolemes.curriculo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardolemes.curriculo.domain.Apresentacao;
import com.ricardolemes.curriculo.dto.ApresentacaoDTO;
import com.ricardolemes.curriculo.services.ApresentacaoService;

@RestController
@RequestMapping(value = "/apresentacao")
public class ApresentacaoResource {

	@Autowired
	private ApresentacaoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ApresentacaoDTO>> findAll() {
		List<Apresentacao> list = service.findAll();
		List<ApresentacaoDTO> listDto = list.stream().map(obj -> new ApresentacaoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Apresentacao obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
