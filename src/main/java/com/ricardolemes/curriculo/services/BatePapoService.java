package com.ricardolemes.curriculo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricardolemes.curriculo.domain.BatePapo;
import com.ricardolemes.curriculo.repositories.BatePapoRepository;

@Service
public class BatePapoService {

	@Autowired
	private BatePapoRepository batePapoRepository;
	@Autowired
	private EmailService emailService;

	
	public BatePapo insert(BatePapo obj) {

		obj.setId(null);
		obj.setEmail(obj.getEmail().toString());
		obj.setObservacao(obj.getObservacao());

		obj = batePapoRepository.save(obj);
		emailService.sendOrderConfirmationEmail(obj);
		return obj;

	}

}
