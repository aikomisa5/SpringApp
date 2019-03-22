package com.springApp.repository;

import com.springApp.dto.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by mbritos on 12/03/2019.
 */
//@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
