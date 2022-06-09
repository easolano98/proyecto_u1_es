package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un nuevo retiro "+r);
	}

	@Override
	public Retiro buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el retiro con el id " + id);
		Retiro retiro = new Retiro();
		retiro.setId(id);
		return retiro;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado su retiro "+r);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro numero"+ id);
	}

}
