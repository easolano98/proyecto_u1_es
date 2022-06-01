package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	//CRUD
		//SOLO CONTRATOS
		//Crear
		public void ingresarEstudiante(Estudiante e);
		//Leer
		public Estudiante buscarPorApellido(String apellido);
		//Actualizar
		public void actualizarEstudiante(Estudiante e);
		//Eliminar
		public void borrarEstudiante(String cedula);
}
