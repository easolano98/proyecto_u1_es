package com.uce.edu.demo.tareacinco.di.constructor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ComprasFactura {

	private LocalDateTime fechaFactura;

	// 2) DI por Constructor
	private Cliente cliente;
	private ComisariatoSucursal comisariato;

	public ComprasFactura(Cliente cliente, ComisariatoSucursal comisariato) {
		this.cliente = cliente;
		this.comisariato = comisariato;
	}

	public String generarFactura(LocalDateTime fechaFactura, String nombreComisariato, String sucursal, String ruc,
			String clienteNombre, String cedula, String telefono) {

		this.cliente.setCedulaId(cedula);
		this.cliente.setNombre(clienteNombre);
		this.cliente.setTelefono(telefono);

		this.comisariato.setNombreComisariato(nombreComisariato);
		this.comisariato.setRuc(ruc);
		this.comisariato.setSucursal(sucursal);

		return "Se ha generado su factura gracias por preferir a: " + this.comisariato.getNombreComisariato();

	}

	// GET y SET
	public LocalDateTime getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDateTime fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ComisariatoSucursal getComisariato() {
		return comisariato;
	}

	public void setComisariato(ComisariatoSucursal comisariato) {
		this.comisariato = comisariato;
	}

}
