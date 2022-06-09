package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	public void realizar(String numeroCta,BigDecimal monto);
	
	public void editar(Retiro r);
	
	public void eliminar(String numeroCta);
	
	public Retiro buscar(String numeroCta); 
}
