package com.britos.spring;

import com.britos.spring.model.Persona;
import com.britos.spring.repository.PersonaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	/*
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(PersonaRepository userRepository) throws Exception {
		return (String[] args) -> {
			Persona user1 = new Persona();
			user1.setNombre("Fifo");
			userRepository.save(user1);
			userRepository.findAll().forEach(user -> System.out.println(user));
		};
	}

}
