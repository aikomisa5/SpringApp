package com.springApp.data.dao.implementations;

import com.springApp.data.dao.interfaces.DAOPersona;
import com.springApp.dto.Persona;

public class DAOPersonaImplHibernate extends DAOGenericoImplHibernate<Persona> implements DAOPersona {

	/*public DAOPersonaImplHibernate(Class<Persona> clase) {
		super(clase);
	}*/

	public DAOPersonaImplHibernate() {
		super(Persona.class);
	}

}
