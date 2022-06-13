package com.uce.edu.demo.comisariatosm.modelo;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Producto implements Comparable<LocalDateTime> {
	private double precioVenta;
	private String idProducto;
	private String nombre;
	private double precioCompra;
	private int stock;
	private LocalDateTime fechaIngreso;
	// SET y GET

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		String pattern = "#.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String formattedDouble = decimalFormat.format(this.precioVenta);
		return "\n"+nombre + " Stock: " + stock + " Precio $ " + formattedDouble + " Fecha de Ingreso: " + fechaIngreso;
	}

	@Override

	public int compareTo(LocalDateTime o) {
		// TODO Auto-generated method stub
		return this.fechaIngreso.compareTo(o);
	}

}
