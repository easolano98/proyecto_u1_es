package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public Transferencia buscar (String ctaDestino);
	
	public void editar(Transferencia t);
	
	public void borrar(String ctaOrigen);
}
