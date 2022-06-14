package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepo;
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.buscar(numero);
	}

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.crear(c);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.eliminar(numero);
	}

	@Override
	public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		return null;
	}

}
