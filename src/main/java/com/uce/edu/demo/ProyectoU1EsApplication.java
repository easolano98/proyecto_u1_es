package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tareacinco.di.atributos.Matriculas;
import com.uce.edu.demo.tareacinco.di.constructor.ComprasFactura;
import com.uce.edu.demo.tareacinco.di.set.ClaseDeConduccion;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {
	// 1) DI por atributo
//	@Autowired
//	private CitaMedica cita;

//	@Autowired
//	private CitaMedica2 cita;

	// Tarea 5

	@Autowired
	private Matriculas matricula;

	@Autowired
	private ComprasFactura factura;

	@Autowired
	private ClaseDeConduccion clase;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		String respuesta=cita.agendar(LocalDateTime.now(), "Pepe", "Teran", 32, "Quito", "Joselito",19);
//		System.out.println(respuesta);

		// Impresiones Tarea 5

		System.out.println("Tarea 5");

		// DI por Atributo
		String impresionMatricula = matricula.generarMatricula("Erick", "Solano", 24, "Prog Av II", 8);
		System.out.println(impresionMatricula);

		// DI por Constructor
		String impresionFactura = factura.generarFactura(LocalDateTime.now(), "SANTA MARIA",
				"Av. Pedro Vicente Maldonado", "172235456872", "Rosita Tipan", "1725354812", "0991568741");
		System.out.println(impresionFactura);

		// DI por metodo SET
		String impresionClase = clase.agendarClase(LocalDateTime.now(), "Erick Solano", "1715202230", "O+",
				"Jorge Ulloa", 10, "Chevrolet AVEO", "Rojo", "Deportivo");
		System.out.println(impresionClase);
	}

}
