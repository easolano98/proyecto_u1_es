package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public Deposito buscar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito a la cuenta destinataria numero " + numCuentaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numCuentaDestino);
		return deposito;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito " + d);
	}

	@Override
	public void eliminar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito de la cuenta destino numero " + numCuentaDestino);
	}

}
