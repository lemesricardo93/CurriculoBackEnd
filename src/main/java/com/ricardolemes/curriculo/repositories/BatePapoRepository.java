package com.ricardolemes.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardolemes.curriculo.domain.BatePapo;

@Repository
public interface BatePapoRepository  extends JpaRepository<BatePapo, Integer> {
	

}
