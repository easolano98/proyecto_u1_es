package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.comisariatosm.modelo.Inventario;
import com.uce.edu.demo.comisariatosm.modelo.Producto;
import com.uce.edu.demo.comisariatosm.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {

	@Autowired
	private IGestorInventarioService gestorInventario;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Inventario i = new Inventario();
		
		//Productos
		Producto prod1 = new Producto();

		prod1.setIdProducto("P01");
		prod1.setNombre("Atun Real");
		prod1.setPrecioCompra(1.00);
		prod1.setStock(10);
		prod1.setFechaIngreso(LocalDateTime.of(2022, 7, 1, 17, 10, 1));

		Producto prod2 = new Producto();

		prod2.setIdProducto("P02");
		prod2.setNombre("Mantequilla Regia");
		prod2.setPrecioCompra(1.50);
		prod2.setStock(30);
		prod2.setFechaIngreso(LocalDateTime.of(2022, 1, 1, 17, 10, 1));


		Producto prod3 = new Producto();

		prod3.setIdProducto("P03");
		prod3.setNombre("Coca Cola 3LT");
		prod3.setPrecioCompra(2.50);
		prod3.setStock(55);
		prod3.setFechaIngreso(LocalDateTime.of(2021, 3, 1, 17, 10, 1));

		
		Producto prod4 = new Producto();

		prod4.setIdProducto("P04");
		prod4.setNombre("Gelatina Royal");
		prod4.setPrecioCompra(4.00);
		prod4.setStock(20);
		prod4.setFechaIngreso(LocalDateTime.of(2019, 12, 1, 17, 10, 1));

		
		Producto prod5 = new Producto();

		prod5.setIdProducto("P05");
		prod5.setNombre("Queso Tony");
		prod5.setPrecioCompra(2.00);
		prod5.setStock(50);
		prod5.setFechaIngreso(LocalDateTime.of(2020, 7, 1, 17, 10, 1));

		System.out.println(" ");
		//Se insertan los productos
		this.gestorInventario.crearInventario(prod1, i);
		this.gestorInventario.insertarProducto(prod2, i);
		this.gestorInventario.insertarProducto(prod3, i);
		this.gestorInventario.insertarProducto(prod4, i);
		this.gestorInventario.insertarProducto(prod5, i);
		
		//Se filtra los productos mediante la fecha ingresada y ahi se genera el precio real
		System.out.println("\n------------- Consultando reporte-------- ");
		this.gestorInventario.consultarInventario(i, LocalDateTime.of(2022, 1, 1, 0, 0));
	}

}
