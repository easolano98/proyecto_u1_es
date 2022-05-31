package com.uce.edu.demo.tareacinco.di.set;

import org.springframework.stereotype.Component;

@Component
public class Auto {
	private String modelo;
	private String color;
	private String tipo;
	
	
	//SET y GET
	
	public String getColor() {
		return color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
