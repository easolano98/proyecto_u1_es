package com.uce.edu.demo.tareacinco.di.atributos;

import org.springframework.stereotype.Component;

@Component
public class Materia {

	private String nombreMateria;
	private int numeroHoras;

	// SET y GET
	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

}
