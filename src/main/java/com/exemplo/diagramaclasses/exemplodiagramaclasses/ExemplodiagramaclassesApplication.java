package com.exemplo.diagramaclasses.exemplodiagramaclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplodiagramaclassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplodiagramaclassesApplication.class, args);
		Aula aula  = new Aula();
		aula.professor.nome = "Mago";
		System.out.println("Funcionou");


	}

}
