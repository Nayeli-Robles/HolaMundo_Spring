package com.farmacia.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.model.Proveedor;
import com.farmacia.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServicio {
	
	@Autowired
	private ProveedorRepositorio proRepo;
	
	public List<Proveedor> listAll(){
		return proRepo.findAll();
	}
	
	public void save(Proveedor prov) {
		proRepo.save(prov);
	}
	
	public Proveedor get(Integer id) {
		return proRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		proRepo.deleteById(id);
	}

}
