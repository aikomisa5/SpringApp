package com.springApp.data.dao.implementations;

import com.springApp.data.conexion.ConexionJPA;
import com.springApp.data.conexion.TipoConexion;
import com.springApp.data.dao.interfaces.DAOPersona;
import com.springApp.dto.Persona;

public class DAOPersonaImplJPA extends DAOGenericoImplJPA<Persona> implements DAOPersona{
	
	public DAOPersonaImplJPA() {
		super(Persona.class);
	}

	public void setTipoConexion(TipoConexion tipo) {
		ConexionJPA.setTipoConexion(tipo);
	}
}
