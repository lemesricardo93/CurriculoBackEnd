package com.ricardolemes.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardolemes.curriculo.domain.Apresentacao;

@Repository
public interface ApresentacaoRepository  extends JpaRepository<Apresentacao, Integer> {
	

}
