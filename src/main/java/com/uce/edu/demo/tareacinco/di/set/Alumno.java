package com.uce.edu.demo.tareacinco.di.set;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private String nombre;
	private String cedulaId;
	private String tipoSangre;
	
	//GET y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCedulaId() {
		return cedulaId;
	}
	public void setCedulaId(String cedulaId) {
		this.cedulaId = cedulaId;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	
	
}
