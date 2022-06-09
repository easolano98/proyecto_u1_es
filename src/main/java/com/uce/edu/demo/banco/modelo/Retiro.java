package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	private BigDecimal monto;
	private String id;
	private String numCuenta;
	private LocalDateTime fecha;
	
	//SET y GET
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Retiro [monto=" + monto + ", id=" + id + ", numCuenta=" + numCuenta + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
}
