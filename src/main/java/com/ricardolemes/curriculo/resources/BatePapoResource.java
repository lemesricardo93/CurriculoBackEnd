package com.ricardolemes.curriculo.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ricardolemes.curriculo.domain.BatePapo;
import com.ricardolemes.curriculo.services.BatePapoService;

@RestController
@RequestMapping(value = "/batepapo")
public class BatePapoResource {
	
	@Autowired
	private BatePapoService service;

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert (@Valid @RequestBody BatePapo obj) {     
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				  .path("/{id}").buildAndExpand(obj.getId()).toUri();		
		return ResponseEntity.created(uri).build();
}
}
