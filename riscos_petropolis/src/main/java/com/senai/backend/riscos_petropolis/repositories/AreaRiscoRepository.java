package com.senai.backend.riscos_petropolis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.riscos_petropolis.models.AreaRisco;

@Repository
public interface AreaRiscoRepository extends JpaRepository<AreaRisco, Integer>{

}

