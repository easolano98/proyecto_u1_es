package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula ma) {
		// TODO Auto-generated method stub
	System.out.println("se ha insertado "+ ma);	
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("buscando matricula Num "+numero);
		Matricula ma =new Matricula();
		ma.setNumero(numero);
		return ma;
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado matricula "+ma);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado matricula "+ numero);
	}
	
}
