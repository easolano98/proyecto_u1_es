package com.uce.edu.demo.tareacinco.di.atributos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Matriculas {
	//1) DI por atributo
	
	@Autowired
	private Estudiante estudiante;
	@Autowired
	private Materia materia;
	
	public String generarMatricula(String nombreEstudiante, String apellidoEstudiante,
			int edadEstudiante, String materia, int numeroHorasMateria) {
		
		this.estudiante.setNombre(nombreEstudiante);
		this.estudiante.setApellido(apellidoEstudiante);
		this.estudiante.setEdad(edadEstudiante);

		this.materia.setNombreMateria(materia);
		this.materia.setNumeroHoras(numeroHorasMateria);

	
		return "Se ha generado matricula exitosamente";
	}
	
	
	//SET y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}
