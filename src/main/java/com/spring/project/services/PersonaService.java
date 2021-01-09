package com.spring.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.model.Persona;
import com.spring.project.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
    private PersonaRepository repository;
	
	public Persona getPersona(Long id) {
        return repository.findOne(id);
    }

    public Persona savePersona(Persona persona) {
        return repository.save(persona);
    }

    public Persona updatePersona(Persona persona) {
        return repository.save(persona);
    }

    public void deletePersona(Persona persona) {
        repository.delete(persona);
    }

    public void deletePerson(Long id) {
        repository.delete(id);
    }

    public List<Persona> getAllPersonas() {
        return repository.findAll();
    }

    public long countPersonas() {
        return repository.count();
    }
}