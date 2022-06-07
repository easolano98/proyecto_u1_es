package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;
@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
	System.out.println("Se ha insertado materia");	
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Buscando");
		Materia m=new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
	System.out.println("se ha actualizado "+m);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado "+nombre);
		
	}

}
