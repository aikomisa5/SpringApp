package com.springApp.services;

import com.springApp.dal.PersonaDAL;
import com.springApp.dto.Persona;
import com.springApp.interfaces.PersonaServiceInterface;
import com.springApp.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mbritos on 12/03/2019.
 */
@Service
public class PersonaServiceImpl implements PersonaServiceInterface {

    private final PersonaRepository personaRepository;
    private final PersonaDAL personaDAL;

    @Autowired
    public PersonaServiceImpl(PersonaRepository personRepository, PersonaDAL personaDAL) {
        this.personaRepository = personRepository;
        this.personaDAL = personaDAL;
    }

    @Override
    public Persona createPerson(Persona person) {
        return personaRepository.save(person);
    }

    @Override
    public Persona getPerson(Long id) {
        return personaRepository.findOne(id);
    }

    @Override
    public Persona editPerson(Persona person) {
        return personaRepository.save(person);
    }

    @Override
    public void deletePerson(Persona person) {
        personaRepository.delete(person);
    }

    @Override
    public void deletePerson(Long id) {
        personaRepository.delete(id);
    }

    @Override
    public List<Persona> getAllPersons(int pageNumber, int pageSize) {
        return personaRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    @Override
    public List<Persona> getAllPersons() {
        return personaRepository.findAll();
    }

    @Override
    public long countPersons() {
        return personaRepository.count();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> fuzzySearchPerson(String term) {
        return personaDAL.fuzzySearchPerson(term);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> wildCardSearchPerson(String term) {
        return personaDAL.wildCardSearchPerson(term);
    }
}