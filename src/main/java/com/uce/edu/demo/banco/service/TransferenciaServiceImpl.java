package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	// como la logica de CuentaBancariaService no hace nada
	// si puedo inyectar el CuentaBancariaRepository
	@Autowired
	@Qualifier("ahorros")

	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository transferenciaRepo;

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(saldoDestino);
		cOrigen.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaOrigen);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());

		this.transferenciaRepo.insertar(t);

	}

	@Override
	public void editar(Transferencia t) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.actualizar(t);
	}

	@Override
	public void borrar(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.transferenciaRepo.eliminar(ctaOrigen);
	}

	@Override
	public List<Transferencia> consultar(String numCuentaDestino, LocalDateTime fechaInicio,
			LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		return transferenciaRepo.consultar(numCuentaDestino, fechaInicio, fechaRetiro);
	}

}
