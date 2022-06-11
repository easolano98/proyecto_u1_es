package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String numeroCta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro=new ArrayList<>();
		Retiro retiro1=new Retiro();
		retiro1.setFecha(LocalDateTime.of(2022, 12,20,13,51,20));
		retiro1.setMonto(new BigDecimal(20));
		retiro1.setNumCuenta("1234");
		listaRetiro.add(retiro1);
		
		return listaRetiro;
	}

}
