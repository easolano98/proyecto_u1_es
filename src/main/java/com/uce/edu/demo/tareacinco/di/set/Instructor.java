package com.uce.edu.demo.tareacinco.di.set;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
	private String nombre;
	private int aniosExperiencia;
	
	//GET y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
}
