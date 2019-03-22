package com.springApp.unitTest;

import com.springApp.data.conexion.ConexionHibernate;
import com.springApp.data.conexion.TipoConexion;
import com.springApp.data.dao.implementations.DAOPersonaImplHibernate;
import com.springApp.dto.Persona;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConexionHibernateTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void pruebaConexion() {
		ConexionHibernate.setTipoConexion(TipoConexion.MySQLServer);
		ConexionHibernate.openSession();
		assertTrue(true);
	}

	@Test
	public void pruebaCreate(){

		DAOPersonaImplHibernate dao = new DAOPersonaImplHibernate();
		Persona persona = new Persona();
		persona.setNombre("Ricardo");
		persona.setApellido("Ruben");
		boolean resultado = false;
		resultado = dao.create(persona);

		System.out.print("Resultado create: " + resultado);

	}

}
