package com.uce.edu.demo.comisariatosm.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
	
	private LocalDateTime fecha;
	private List<Producto> inventarioProductos;
	// SET y GET

	public List<Producto> getInventarioProductos() {
		return inventarioProductos;
	}

	public void setInventarioProductos(List<Producto> inventarioProductos) {
		this.inventarioProductos = inventarioProductos;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	
	@Override
	public String toString() {
		return "Inventario [inventarioProductos=" + inventarioProductos + "]";
	}

	
	

	
}
