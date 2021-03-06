package com.ricardolemes.curriculo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolemes.curriculo.domain.Apresentacao;
import com.ricardolemes.curriculo.domain.AtividadeExtraCurricular;
import com.ricardolemes.curriculo.domain.Candidato;
import com.ricardolemes.curriculo.repositories.ApresentacaoRepository;
import com.ricardolemes.curriculo.repositories.AtividadeExtraCurricularRepository;
import com.ricardolemes.curriculo.repositories.CandidatoRepository;

@Service
public class DBServices {

	@Autowired
	private CandidatoRepository candidatoRepository;

	@Autowired
	private ApresentacaoRepository apresentacaoRepository;

	@Autowired
	private AtividadeExtraCurricularRepository atvExtraCurricular;

	public void instatiateTestDatabase() throws ParseException {

		Apresentacao ap1 = new Apresentacao(null,
				"Seja bem vindo a minha página. Aqui Falarei sobre minha história profissional"
						+ " como encontrei a tecnologia, cursos e projetos ao longo desses anos."

						+ "   " + "Fique a vontade");

		apresentacaoRepository.save(ap1);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Candidato cand1 = new Candidato(null, "Ricardo de Sousa Lemes Filho", "lemesricardo93@gmail.com", "11111111111",
				sdf.parse("17/09/1993 00:00"), "Rua 20 n 50");
		cand1.getTelefones().addAll(Arrays.asList("62 9 99467003", "62 9 99467003"));

		candidatoRepository.saveAll(Arrays.asList(cand1));
		AtividadeExtraCurricular atv = new AtividadeExtraCurricular(null, "Curso de Excelência no Atendimento", 15,
				"Universidade Estadual de Goiás (UEG)", sdf.parse("01/01/2013 00:00"), sdf.parse("31/03/2013 00:00"),
				cand1);
		cand1.getAtvExtraCurriculars().addAll(Arrays.asList(atv));

		atvExtraCurricular.saveAll(Arrays.asList(atv));

	}
}
