package com.uce.edu.demo.comisariatosm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.comisariatosm.modelo.Producto;
import com.uce.edu.demo.comisariatosm.repository.IProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoRepository productoRepository;
	
	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepository.insertar(p);
	}

	@Override
	public Producto buscar(String codProd) {
		return this.productoRepository.buscar(codProd);
	}

	@Override
	public void eliminar(String codProd) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(codProd);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(p);
	}

	
	

}
