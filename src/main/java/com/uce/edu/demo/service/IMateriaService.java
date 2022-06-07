package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	
	//CRUD
		//SOLO CONTRATOS
		//Crear
		public void insertar(Materia m);
		//Leer
		public Materia buscar(String nombreMa);
		//Actualizar
		public void actualizar(Materia m);
		//Eliminar
		public void eliminar(String nombreMa);
}
