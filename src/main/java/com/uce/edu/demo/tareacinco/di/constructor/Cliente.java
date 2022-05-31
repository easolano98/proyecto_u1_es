package com.uce.edu.demo.tareacinco.di.constructor;

import org.springframework.stereotype.Component;

@Component

public class Cliente {
	private String nombre;
	private String cedulaId;
	private String telefono;
	
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
