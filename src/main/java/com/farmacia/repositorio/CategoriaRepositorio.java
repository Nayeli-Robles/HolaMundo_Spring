package com.farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{

}
