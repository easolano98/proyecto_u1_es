package com.uce.edu.demo.comisariatosm.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;
import com.uce.edu.demo.comisariatosm.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IProductoService productoService;
	@Autowired
	private IInventarioService inventarioService;

	@Override
	public void crearInventario(Producto p, Inventario i) {
		// TODO Auto-generated method stub
		
		this.inventarioService.crear(p, i);
		this.productoService.insertar(p);
	}

	@Override
	public void consultarInventario(Inventario i, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Producto> inventario = i.getInventarioProductos();

		for (Producto inv : inventario) {
			this.precioReal(inv);
			this.productoService.actualizar(inv);
		}

		i.setInventarioProductos(inventario);
		this.inventarioService.actualizar(i);
		System.out.println("\nNombre/Cantidad/Precio/Fecha");
		for (Producto inv : inventario) {

			if (inv.compareTo(fecha) > 0) {
				System.out.println(inv);
			}

		}
	}

	private void precioReal(Producto p) {
		double precioCompraSm = p.getPrecioCompra();
		double g = 0.10 * precioCompraSm;
		double iva = 0.12 * precioCompraSm;
		double precioVentaSm = precioCompraSm + g + iva;
		p.setPrecioVenta(precioVentaSm);
	}

	@Override
	public void insertarProducto(Producto p, Inventario i) {
		// TODO Auto-generated method stub
		this.productoService.insertar(p);
		List<Producto> insertarProd = i.getInventarioProductos();
		insertarProd.add(p);
		i.setInventarioProductos(insertarProd);
		this.inventarioService.actualizar(i);
	}

}
