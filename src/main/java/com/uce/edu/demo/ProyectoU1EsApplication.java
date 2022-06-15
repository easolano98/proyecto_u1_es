package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {
	@Autowired
	private ProfesorGeneral profesorGeneral;

	@Autowired
	private ProfesorGeneral profesorGeneral1;

	@Autowired
	private ProfesorMateria materia;
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService matricula;
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EJEMPLO SINGLETON");

		this.profesorGeneral.setNombre("Pepito");
		this.profesorGeneral.setApellido("Gomez");

		System.out.println(this.profesorGeneral);
		System.out.println("--------------\n" + this.profesorGeneral1);
		this.profesorGeneral1.setNombre("Juanito");
		System.out.println("--------------\n" + this.profesorGeneral1);
		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");
		System.out.println(this.materia);
		System.out.println("--------------\n" + this.materia1);

		Matricula matricula1=new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1234");
		this.matricula.insertar(matricula1);
		
	}

}
