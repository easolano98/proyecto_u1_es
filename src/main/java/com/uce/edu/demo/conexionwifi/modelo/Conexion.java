package com.uce.edu.demo.conexionwifi.modelo;

import java.time.LocalDateTime;

public class Conexion {
	private String idConexion;
	private LocalDateTime fecha;
	
	//SET y GET
	public String getIdConexion() {
		return idConexion;
	}
	public void setIdConexion(String idConexion) {
		this.idConexion = idConexion;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Conexion [idConexion=" + idConexion + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
