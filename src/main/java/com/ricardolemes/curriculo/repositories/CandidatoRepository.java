package com.ricardolemes.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardolemes.curriculo.domain.Candidato;

@Repository
public interface CandidatoRepository  extends JpaRepository<Candidato, Integer> {
	

}
