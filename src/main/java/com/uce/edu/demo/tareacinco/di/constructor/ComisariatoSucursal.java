package com.uce.edu.demo.tareacinco.di.constructor;

import org.springframework.stereotype.Component;

@Component

public class ComisariatoSucursal {
	private String nombreComisariato;
	private String sucursal;
	private String ruc;
	
	//GET y SET
	public String getNombreComisariato() {
		return nombreComisariato;
	}
	public void setNombreComisariato(String nombreComisariato) {
		this.nombreComisariato = nombreComisariato;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	
	
}
