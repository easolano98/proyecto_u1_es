package com.uce.edu.demo.comisariatosm.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;
import com.uce.edu.demo.comisariatosm.modelo.Producto;

public interface IInventarioService {
	
	public void crear(Producto p, Inventario i);
	
	public Inventario consultar(LocalDateTime fecha);
	
	public void eliminar (LocalDateTime fecha);
	
	public void actualizar(Inventario i);
}
