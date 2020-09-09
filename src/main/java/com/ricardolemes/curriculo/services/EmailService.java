package com.ricardolemes.curriculo.services;

import org.springframework.mail.SimpleMailMessage;

import com.ricardolemes.curriculo.domain.BatePapo;

public interface EmailService {
	
	void sendOrderConfirmationEmail(BatePapo obj);	
	void sendEmail (SimpleMailMessage msg);
	
	
	
	

}
