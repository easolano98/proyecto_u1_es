package com.uce.edu.demo.tareacinco.di.set;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseDeConduccion {

	private LocalDateTime fechaClase;
	
	//3) DI por metodos SET
	private Auto auto;
	private Alumno alumno;
	private Instructor instructor;

	public String agendarClase(LocalDateTime fechaClase, String nombreAlumno, String cedula,
			String tipoSangreEstudiante, String instructor, int aniosExperiencia, String modeloAuto, String color,
			String tipoAuto) {

		this.alumno.setNombre(nombreAlumno);
		this.alumno.setCedulaId(cedula);
		this.alumno.setTipoSangre(tipoSangreEstudiante);

		this.instructor.setNombre(instructor);
		this.instructor.setAniosExperiencia(aniosExperiencia);

		this.auto.setModelo(modeloAuto);
		this.auto.setTipo(tipoAuto);
		this.auto.setColor(color);

		return "Estimado: " + alumno.getNombre() + " Se ha agendado su clase de conduccion EXITOSAMENTE ";
	}

	public LocalDateTime getFechaClase() {
		return fechaClase;
	}

	public void setFechaClase(LocalDateTime fechaClase) {
		this.fechaClase = fechaClase;
	}

	public Auto getAuto() {
		return auto;
	}

	@Autowired
	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	@Autowired
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	@Autowired
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
