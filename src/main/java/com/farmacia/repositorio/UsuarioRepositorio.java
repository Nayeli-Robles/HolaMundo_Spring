package com.farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
