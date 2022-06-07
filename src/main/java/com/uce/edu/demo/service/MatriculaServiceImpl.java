package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void insertar(Matricula ma) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(ma);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(ma);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}
	
}
