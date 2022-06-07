package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante();
		e.setNombre("Erick");
		e.setApellido("Solano");
		e.setCedula("1750154846");
		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Alegria");
		e1.setCedula("1750154846");
		this.estudianteService.ingresarEstudiante(e1);

		// Usar los 3 metodos restantes
		e.setCedula("1720223040");
		this.estudianteService.actualizarEstudiante(e);

		this.estudianteService.buscarPorApellido("Solano");
		this.estudianteService.borrarEstudiante("1720223040");

	}

}
