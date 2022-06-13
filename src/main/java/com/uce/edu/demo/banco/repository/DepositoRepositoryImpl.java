package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito " + d);
	}

	@Override
	public void eliminar(String numCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito de la cuenta destino numero " + numCuentaDestino);
	}

	@Override
	public List<Deposito> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepos=new ArrayList<>();
		Deposito depo1=new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2,10,8,50,2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("234");
		listaDepos.add(depo1);
		
		Deposito depo2=new Deposito();
		depo2.setFecha(LocalDateTime.of(2020, 12,11,18,20,2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("2345");
		listaDepos.add(depo2);
		
		
		return listaDepos;
	}

}
