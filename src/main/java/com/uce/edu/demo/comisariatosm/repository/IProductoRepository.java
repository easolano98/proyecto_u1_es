package com.uce.edu.demo.comisariatosm.repository;

import com.uce.edu.demo.comisariatosm.modelo.Producto;

public interface IProductoRepository {
	public void insertar(Producto p);
	
	public Producto buscar(String codProd);
	
	public void eliminar(String codProd);
	
	public void actualizar(Producto p);
	
}
