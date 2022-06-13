package com.uce.edu.demo.comisariatosm.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario inv) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un inventario " + inv);
	}

	@Override
	public void actualizar(Inventario inv) {
		// TODO Auto-generated method stub
		System.out.println("Actualizado inventario");
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado inventario con la fecha " + fecha);
	}

	@Override
	public Inventario buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se busca inventario " + fecha);
		Inventario inventario = new Inventario();
		inventario.setFecha(fecha);
		return inventario;
	}

}
