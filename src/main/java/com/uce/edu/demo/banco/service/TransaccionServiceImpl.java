package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {
	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private IDepositoService depositoService;
	@Autowired
	private IRetiroService retiroService;
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private IDepositoRepository depositoRepository;
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroService.realizar(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.transferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.depositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.retiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		// Vamos a unir todas las listas
		List<TransaccionTo> listaFinal = new ArrayList<>();

		for (Transferencia t : listaTrans) {
			TransaccionTo transaccionTo = this.transformar(t);
			listaFinal.add(transaccionTo);
		}

		for (Deposito d : listaDepo) {
			TransaccionTo transaccionTo = this.transformar(d);
			listaFinal.add(transaccionTo);
		}

		for (Retiro r : listaReti) {
			TransaccionTo transaccionTo = this.transformar(r);
			listaFinal.add(transaccionTo);
		}

		return listaFinal;

	}

	private TransaccionTo transformar(Transferencia transferencias) {
		TransaccionTo transTo = new TransaccionTo();
		transTo.setFecha(transferencias.getFechaTransferencia());
		transTo.setMonto(transferencias.getMontoTransferir());
		transTo.setTipo("T");
		return transTo;
	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo transTo = new TransaccionTo();
		transTo.setFecha(deposito.getFecha());
		transTo.setMonto(deposito.getMonto());
		transTo.setTipo("D");
		return transTo;
	}

	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo transTo = new TransaccionTo();
		transTo.setFecha(retiro.getFecha());
		transTo.setMonto(retiro.getMonto());
		transTo.setTipo("R");
		return transTo;
	}

}
