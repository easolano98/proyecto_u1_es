package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void insertar(Matricula ma);
	//Leer
	public Matricula buscar(String numero);
	//Actualizar
	public void actualizar(Matricula ma);
	//Eliminar
	public void eliminar(String numero);

}
