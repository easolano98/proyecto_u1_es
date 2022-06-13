package com.uce.edu.demo.comisariatosm.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;

public interface IInventarioRepository {
	public void insertar(Inventario inv);

	public void actualizar(Inventario inv);

	public void eliminar(LocalDateTime fecha);

	public Inventario buscar(LocalDateTime fecha);
}
