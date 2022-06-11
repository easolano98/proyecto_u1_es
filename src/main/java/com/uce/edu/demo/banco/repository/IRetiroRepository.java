package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void insertar(Retiro r);
	
	public Retiro buscar(String id);
	
	public void actualizar(Retiro r);

	public void eliminar(String id);
	
	public List<Retiro> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	
}	
