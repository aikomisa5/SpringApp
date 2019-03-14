package com.springApp.dal;

import com.springApp.dto.Persona;

import java.util.List;

/**
 * Created by mbritos on 12/03/2019.
 */
public interface PersonaDAL {
    List<Persona> fuzzySearchPerson(String term);
    List<Persona> wildCardSearchPerson(String term);
}