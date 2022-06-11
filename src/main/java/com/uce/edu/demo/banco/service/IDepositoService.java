package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	
	public void editar(Deposito d);
	
	public void eliminar(String numeroCtaDestino);
	
	public List<Deposito> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
