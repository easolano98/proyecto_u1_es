package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	public void realizar(String numeroCta,BigDecimal monto);
	
	public void editar(Retiro r);
	
	public void eliminar(String numeroCta);
	
	public Retiro buscar(String numeroCta); 
	
	public List<Retiro> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
