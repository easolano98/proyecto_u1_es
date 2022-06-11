package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public List<Transferencia> consultar(String numCuentaDestino, LocalDateTime fechaInicio, LocalDateTime fechaRetiro  );

	public void editar(Transferencia t);
	
	public void borrar(String ctaOrigen);
}
