package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizar(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCuenta = cuenta.getSaldo();
		cuenta.setSaldo(saldoCuenta.subtract(monto));
		this.bancariaService.actualizar(cuenta);

		Retiro retirar = new Retiro();
		retirar.setFecha(LocalDateTime.now());
		retirar.setId("Retiro01");
		retirar.setNumCuenta(numeroCta);
		retirar.setMonto(monto);
		this.retiroRepository.insertar(retirar);
	}

	@Override
	public void editar(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminar(String numeroCta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCta);
	}

	@Override
	public Retiro buscar(String numeroCta) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCta);
	}

	@Override
	public List<Retiro> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.retiroRepository.consultar(numeroCta, fechaInicio, fechaFin);
	}

}
