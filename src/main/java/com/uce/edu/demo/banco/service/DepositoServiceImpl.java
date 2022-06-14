package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}

	@Override
	public void editar(Deposito d) {
		// TODO Auto-generated method stub

		this.depositoRepository.actualizar(d);
	}

	@Override
	public void eliminar(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numeroCtaDestino);
	}

	@Override
	public List<Deposito> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return depositoRepository.consultar(numeroCta, fechaInicio, fechaFin);
	}

	

}
