package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.conexionwifi.modelo.Conexion;
import com.uce.edu.demo.conexionwifi.modelo.SeñalWifiPrivada;
import com.uce.edu.demo.conexionwifi.modelo.SeñalWifiPublica;
import com.uce.edu.demo.conexionwifi.service.IConexionService;

@SpringBootApplication
public class ProyectoU1EsApplication implements CommandLineRunner {
	//Prototype
	@Autowired
	private SeñalWifiPrivada señalPrivada;
	
	@Autowired
	private SeñalWifiPrivada señalPrivada2;

	//Singleton
	@Autowired
	private SeñalWifiPublica señalPublica;
	
	@Autowired
	private SeñalWifiPublica señalPublica2;
	
	
	@Autowired
	private IConexionService conexionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Singleton
		System.out.println("EJEMPLO SEÑAL SINGLETON");
		
		this.señalPublica.setIp("127.0.0.1");
		this.señalPublica.setNombre("Quito te conecta");
		
		System.out.println(this.señalPublica);
		System.out.println("--------------\n" + this.señalPublica2);
		
		//Prototype
		System.out.println("EJEMPLO SEÑAL PROTOTYPE");
		
		this.señalPrivada.setIp("172.16.0.9");
		this.señalPrivada.setNombre("Netlife Pepito");
		
		this.señalPrivada2.setIp("192.0.0.7");
		this.señalPrivada2.setNombre("CNT Juanito");
	
		
		System.out.println(this.señalPrivada);
		System.out.println("--------------\n" + this.señalPrivada2);
		
		System.out.println("--------------------------------------------------");
		Conexion conexion=new Conexion();
		conexion.setFecha(LocalDateTime.now());
		conexion.setIdConexion("123");
		this.conexionService.establecer(conexion);
		
		

	}

}
