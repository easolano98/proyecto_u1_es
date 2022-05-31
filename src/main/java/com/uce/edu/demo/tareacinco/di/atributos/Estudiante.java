package com.uce.edu.demo.tareacinco.di.atributos;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {

	private String nombre;
	private String apellido;
	private int edad;
	
	//GET y SET 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
