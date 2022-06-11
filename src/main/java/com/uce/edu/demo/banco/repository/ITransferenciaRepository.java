package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void insertar(Transferencia t);
	
	public void actualizar(Transferencia t);
	
	public List<Transferencia> consultar(String numCuentaDestino, LocalDateTime fechaInicio, LocalDateTime fechaRetiro  );
	
	public void eliminar(String numCuentaDestino);
}
