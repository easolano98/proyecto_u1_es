package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {
	
	@Autowired
	private IRetiroService retiroService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Retiro retiro=new Retiro();
		
		retiro.setNumCuenta("18");
		retiro.setMonto(new BigDecimal(10));
		retiro.setFecha(LocalDateTime.now());
		retiro.setId("02");
		
		retiroService.realizar("16", new BigDecimal(40));
		retiroService.buscar("16");
		retiroService.editar(retiro);
		retiroService.eliminar("18");
		
	}

}
