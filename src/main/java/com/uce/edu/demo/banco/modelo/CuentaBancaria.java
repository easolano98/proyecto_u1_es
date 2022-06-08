package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
	
	private String numero;
	private BigDecimal saldo; //cuando se vaya a manejar valores monetarios, manejar BigDecimal
	
	//GET y SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
