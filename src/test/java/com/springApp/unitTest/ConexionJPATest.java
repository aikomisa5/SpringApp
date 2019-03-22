package com.springApp.unitTest;

import com.springApp.data.conexion.ConexionJPA;
import com.springApp.data.conexion.TipoConexion;
import com.springApp.data.dao.implementations.DAOPersonaImplJPA;
import org.junit.Test;

public class ConexionJPATest {

	@Test
	public void test() {
		DAOPersonaImplJPA dao = new DAOPersonaImplJPA();
		dao.setTipoConexion(TipoConexion.H2Test);
	}
	
	@Test
	public void entityManagerFactory()  {
		ConexionJPA.setTipoConexion(TipoConexion.H2Test);
		ConexionJPA.getEntityManagerFactory();
	}
	
	@Test
	public void entityManager()  {
		ConexionJPA.setTipoConexion(TipoConexion.H2Test);
		ConexionJPA.getEntityManager();
	}

}
