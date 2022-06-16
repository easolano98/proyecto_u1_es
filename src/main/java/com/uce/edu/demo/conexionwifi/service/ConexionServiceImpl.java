package com.uce.edu.demo.conexionwifi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.conexionwifi.modelo.Conexion;
import com.uce.edu.demo.conexionwifi.modelo.SeñalWifiPrivada;
import com.uce.edu.demo.conexionwifi.modelo.SeñalWifiPublica;
import com.uce.edu.demo.conexionwifi.repository.IConexionRepository;

@Service
public class ConexionServiceImpl implements IConexionService {
	@Autowired
	private IConexionRepository conexionRepository;
	
	@Autowired
	private SeñalWifiPrivada privada;
	
	@Autowired
	private SeñalWifiPublica publica;
	
	@Override
	public void establecer(Conexion c) {
		// TODO Auto-generated method stub
		
		System.out.println("Conexion Wifi Singleton "+this.publica);
		System.out.println("Conexion Wifi Prototype "+this.privada);		
		this.conexionRepository.insertar(c);
	}
	
	
	
}
