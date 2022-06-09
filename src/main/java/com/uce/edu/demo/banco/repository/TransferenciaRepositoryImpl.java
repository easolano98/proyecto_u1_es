package com.uce.edu.demo.banco.repository;

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
	public Transferencia buscar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia a la cuenta destino numero "+numCuentaDestino);
		Transferencia transferencia=new Transferencia();
		transferencia.setNumeroCuentaDestino(numCuentaDestino);
		return transferencia;
	}

	@Override
	public void eliminar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la transferencia al numero de cuenta "+numCuentaDestino);
	}

}
