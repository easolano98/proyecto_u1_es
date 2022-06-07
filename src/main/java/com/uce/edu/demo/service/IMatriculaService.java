package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	
	public void insertar(Matricula ma);
	//Leer
	public Matricula buscar(String numero);
	//Actualizar
	public void actualizar(Matricula ma);
	//Eliminar
	public void eliminar(String numero);

}
