package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
