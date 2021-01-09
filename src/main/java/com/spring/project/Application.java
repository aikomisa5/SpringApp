package com.spring.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.project.model.Persona;
import com.spring.project.repository.PersonaRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(PersonaRepository repository) throws Exception {
		return (String[] args) -> {
			Persona persona = new Persona();
			persona.setNombre("Fifo");
			persona.setApellido("Connor");
			repository.save(persona);
			repository.findAll().forEach(p -> System.out.println(p));
		};
	}
}
