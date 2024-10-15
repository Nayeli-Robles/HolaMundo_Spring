package com.farmacia.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.model.Cliente;
import com.farmacia.repositorio.ClienteRepositorio;

@Service
public class ClienteServicio {
	@Autowired
	private ClienteRepositorio cliRepo;
	
	public List<Cliente> listAll(){
		return cliRepo.findAll();
	}
	
	public void save(Cliente cli) {
		cliRepo.save(cli);
	}
	
	public Cliente get(Integer id) {
		return cliRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		cliRepo.deleteById(id);
	}
}
