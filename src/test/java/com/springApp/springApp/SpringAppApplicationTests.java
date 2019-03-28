package com.springApp.springApp;

import com.springApp.data.conexion.ConexionHibernate;
import com.springApp.data.conexion.TipoConexion;
import com.springApp.dto.Persona;
import com.springApp.repository.PersonaRepository;
import com.springApp.services.PersonaServiceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAppApplicationTests {

	PersonaServiceRepositoryImpl dao;

	@Autowired
	PersonaRepository personaRepository;

	@Test
	public void contextLoads() {
	}

	@Before
	@Test
	public void conexionTest() {
		ConexionHibernate.setTipoConexion(TipoConexion.MySQLServer);
		ConexionHibernate.openSession();
		dao = new PersonaServiceRepositoryImpl(personaRepository);
		assertTrue(true);
	}

	@Test
	public void createTest(){
		boolean resultado = false;
		System.out.println("Entro a createTest");

		Persona persona = generarPersonaRandom();
		Persona personaRespuesta = dao.createPerson(persona);

		if (personaRespuesta != null){
			resultado = true;
		}
		else{
			resultado = false;
		}

		System.out.print("Resultado create: " + resultado);

		consultarTabla();
		System.out.println("Salgo de createTest");
	}

	public void consultarTabla(){
		System.out.println("Entro a consultarTabla");

		boolean resultado = false;
		List <Persona> lista = dao.getAllPersons();
		System.out.println("El tamaño de la tabla es: " + lista.size());

		for (Persona p : lista
			 ) {
			System.out.println("Persona: " + p.getNombre() + " " + p.getApellido() +
								" - Documento: " + p.getDocumento() + " - Mail: " + p.getMail());
		}

		System.out.println("Salgo de consultarTabla");
	}

	public Persona generarPersonaRandom(){
		Random r = new Random();
		String cadena = "";
		String documento = "";
		int numero = 0;
		int edad = 0;

		char abcedario [] = {'a','b','c','d','e','f'};

		for (int i  = 0; i<6 ; i++) {
			numero = r.nextInt(6);
			cadena = cadena + abcedario[numero];
		}

		for (int i  = 0; i<8 ; i++) {
			numero = r.nextInt(6);
			documento = documento + (String.valueOf(numero));
		}

		edad = r.nextInt(100);

		Persona persona = new Persona();

		persona.setNombre(cadena);
		persona.setApellido(cadena);
		persona.setActivo(true);
		//persona.setDocumento(documento);
		persona.setEdad(edad);
		persona.setMail(cadena+"@gmail.com");

		return persona;
	}

}
