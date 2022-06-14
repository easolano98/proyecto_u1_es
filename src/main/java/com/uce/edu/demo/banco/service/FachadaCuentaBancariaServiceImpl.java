package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria{
	@Autowired
	
	private ICuentaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	
	@Autowired
	@Qualifier("ahorroFut")
	private ICuentaBancariaService bancariaServiceAhorroFuturo;
	
	
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes=null;
		CuentaBancaria cta=this.bancariaRepository.buscar(numeroCta);
		
		if(cta.getTipo().equals("A")) {
			//Ahorros
			System.out.println(cta.getNumero()+" Cuenta Ahorros\n");
			interes= this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		}else if(cta.getTipo().equals("AF")){
			//AhorroFuturo
			System.out.println(cta.getNumero()+" Cuenta Ahorros Futuro\n");
			interes=this.bancariaServiceAhorroFuturo.calcularInteres(numeroCta, cta.getSaldo());	
		}else {
			//Corriente
			System.out.println(cta.getNumero()+" Corriente\n");
			interes= this.bancariaService.calcularInteres(numeroCta, cta.getSaldo());
		}
		
		return interes;
	}
	
}
