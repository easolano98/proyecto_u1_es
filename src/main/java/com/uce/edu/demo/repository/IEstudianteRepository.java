package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepository {
//CRUD
	//SOLO CONTRATOS
	//Crear
	public void insertar(Estudiante e);
	//Leer
	public Estudiante buscar(String apellido);
	//Actualizar
	public void actualizar(Estudiante e);
	//Eliminar
	public void eliminar(String cedula);
}
