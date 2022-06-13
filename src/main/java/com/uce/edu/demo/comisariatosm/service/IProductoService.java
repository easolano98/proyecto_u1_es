package com.uce.edu.demo.comisariatosm.service;

import com.uce.edu.demo.comisariatosm.modelo.Producto;

public interface IProductoService {
	public void insertar(Producto p);

	public void eliminar(String codProd);

	public void actualizar(Producto p);

	public Producto buscar(String codProd);

}
