package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	public void actualizar(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);

	public void crear(CuentaBancaria c);

	public void eliminar(String numero);
	
	public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo);
}
