package com.springApp.interfaces;

import com.springApp.dto.Persona;

import java.util.List;

/**
 * Created by mbritos on 12/03/2019.
 */
public interface PersonaServiceInterface {
    Persona createPerson(Persona person);
    Persona getPerson(Long id);
    Persona editPerson(Persona person);
    void deletePerson(Persona person);
    void deletePerson(Long id);
    List<Persona> getAllPersons(int pageNumber, int pageSize);
    List<Persona> getAllPersons();
    long countPersons();
    List<Persona> fuzzySearchPerson(String term);
    List<Persona> wildCardSearchPerson(String term);
}