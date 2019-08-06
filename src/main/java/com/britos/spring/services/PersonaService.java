package com.britos.spring.services;

import com.britos.spring.model.Persona;
import com.britos.spring.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personRepository) {
        this.personaRepository = personRepository;
    }

    public Persona createPerson(Persona person) {
        return personaRepository.save(person);
    }

    public Persona getPerson(Long id) {
        return personaRepository.findOne(id);
    }

    public Persona editPerson(Persona person) {
        return personaRepository.save(person);
    }

    public void deletePerson(Persona person) {
        personaRepository.delete(person);
    }

    public void deletePerson(Long id) {
        personaRepository.delete(id);
    }

    public List<Persona> getAllPersons(int pageNumber, int pageSize) {
        return personaRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    public List<Persona> getAllPersons() {
        return personaRepository.findAll();
    }

    public long countPersons() {
        return personaRepository.count();
    }

}