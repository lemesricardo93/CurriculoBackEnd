package com.ricardolemes.curriculo.config;

import java.text.ParseException;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.ricardolemes.curriculo.services.DBServices;
import com.ricardolemes.curriculo.services.EmailService;
import com.ricardolemes.curriculo.services.MockEmailService;

@Configuration
@Profile("teste")
public class TestConfig {
	@Autowired
	private DBServices dbService;

	@Bean
	public boolean instanciateDatabase() throws ParseException {
		dbService.instatiateTestDatabase();

		return true;
	}

	@Bean
	public EmailService emailService() {
		return new MockEmailService();

	}

}
