package com.uce.edu.demo.comisariatosm.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;
import com.uce.edu.demo.comisariatosm.modelo.Producto;
import com.uce.edu.demo.comisariatosm.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {
	
	@Autowired
	private IInventarioRepository inventarioRepository;

	@Override
	public void crear(Producto p, Inventario i) {
		// TODO Auto-generated method stub
		List<Producto>inventarioProd=new ArrayList<>();
		inventarioProd.add(p);
		i.setInventarioProductos(inventarioProd);
		i.setFecha(LocalDateTime.now());
		this.inventarioRepository.insertar(i);
	}

	@Override
	public Inventario consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.inventarioRepository.buscar(fecha);
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		this.inventarioRepository.eliminar(fecha);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.inventarioRepository.actualizar(i);
	}

}
