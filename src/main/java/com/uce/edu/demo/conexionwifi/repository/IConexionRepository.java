package com.uce.edu.demo.conexionwifi.repository;

import com.uce.edu.demo.conexionwifi.modelo.Conexion;

public interface IConexionRepository {
	public void insertar(Conexion c);
	
	public Conexion buscar(String id);
	
	public void actualizar(Conexion c);
	
	public void eliminar(String id);
}
