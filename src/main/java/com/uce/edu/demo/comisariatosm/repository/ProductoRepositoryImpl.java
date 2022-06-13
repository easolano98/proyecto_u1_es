package com.uce.edu.demo.comisariatosm.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.comisariatosm.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el producto "+p);
	}

	@Override
	public Producto buscar(String codProd) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el producto con el codigo "+codProd);
		Producto producto=new Producto();
		producto.setIdProducto(codProd);
		
		return producto;
	}

	@Override
	public void eliminar(String codProd) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto numero "+codProd);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Su producto se ha actualizado "+p.getNombre());
	}

	
}
