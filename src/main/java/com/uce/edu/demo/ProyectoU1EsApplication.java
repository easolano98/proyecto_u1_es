package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IMatriculaService matriculaService;

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
		e.setCedula("1720223040");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Solano");
		this.estudianteService.borrarEstudiante("1720223040");
		System.out.println();
		
		//Tarea 6
		//Materia
		Materia materia=new Materia();
		materia.setNombre("Programacion Avanzada II");
		materia.setSemestre("Sexto");
		this.materiaService.insertar(materia);
		materia.setNombre("Prog Av 2");
		this.materiaService.actualizar(materia);
		this.materiaService.buscar("Prog Av 2");
		this.materiaService.eliminar("Prog Av II");
		Materia materiaDos=new Materia();
		
		materiaDos.setNombre("Inteligencia Artificial");
		materiaDos.setSemestre("Sexto");
		this.materiaService.insertar(materiaDos);
		System.out.println();

		//Matricula
		List<Materia> materias = new ArrayList<Materia>();
		materias.add(materia);
		materias.add(materiaDos);
		Matricula matricula=new Matricula();
		matricula.setNumero("1234");
		matricula.setEstudiante(e);
		matricula.setMateria(materias);
		this.matriculaService.insertar(matricula);
		matricula.setNumero("4929");
		this.matriculaService.actualizar(matricula);
		this.matriculaService.buscar("4929");
		this.matriculaService.eliminar("4929");
		
	}

}
