package com.farmacia.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.model.Empleado;
import com.farmacia.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {

	@Autowired
	private EmpleadoRepositorio empRepo;
	
	public List<Empleado> listAll(){
		return empRepo.findAll();
	}
	
	public void save(Empleado cli) {
		empRepo.save(cli);
	}
	
	public Empleado get(Integer id) {
		return empRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		empRepo.deleteById(id);
	}
}
