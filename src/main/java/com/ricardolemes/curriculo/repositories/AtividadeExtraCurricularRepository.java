package com.ricardolemes.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardolemes.curriculo.domain.AtividadeExtraCurricular;

@Repository
public interface AtividadeExtraCurricularRepository  extends JpaRepository<AtividadeExtraCurricular, Integer> {
	

}
