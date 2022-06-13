package com.uce.edu.demo.comisariatosm.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;
import com.uce.edu.demo.comisariatosm.modelo.Producto;

public interface IGestorInventarioService {
	public void crearInventario(Producto p, Inventario i);
	
	public void insertarProducto(Producto p, Inventario i);

	public void consultarInventario(Inventario i,LocalDateTime fecha);
}
