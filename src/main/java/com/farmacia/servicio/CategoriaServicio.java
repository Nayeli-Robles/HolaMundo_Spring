package com.farmacia.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.model.Categoria;
import com.farmacia.repositorio.CategoriaRepositorio;

@Service
public class CategoriaServicio {
	@Autowired
	private CategoriaRepositorio cateRepo;
	
	public List<Categoria> listAll(){
		return cateRepo.findAll();
	}
	
	public void save(Categoria cate) {
		cateRepo.save(cate);
	}
	
	public Categoria get(Integer id) {
		return cateRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		cateRepo.deleteById(id);
	}
}
