package com.uce.edu.demo.conexionwifi.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.conexionwifi.modelo.Conexion;
@Repository
public class ConexionRepositoryImpl implements IConexionRepository {

	@Override
	public void insertar(Conexion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado una nueva conexion "+c);
	}

	@Override
	public Conexion buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Buscando conexion con el id "+id);
		Conexion conex=new Conexion();
		conex.setIdConexion(id);
	
		return conex;
	}

	@Override
	public void actualizar(Conexion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha acutualizado conexion "+c);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado conexion "+id);
	}

}
