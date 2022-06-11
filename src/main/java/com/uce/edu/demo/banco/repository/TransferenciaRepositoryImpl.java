package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos "+t);
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia "+t);
	}

	

	@Override
	public void eliminar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la transferencia al numero de cuenta "+numCuentaDestino);
	}

	@Override
	public List<Transferencia> consultar(String numCuentaDestino, LocalDateTime fechaInicio,
			LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		List<Transferencia>listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		
		listaConsultada.add(trans1);
		
		return null;
	}

}
