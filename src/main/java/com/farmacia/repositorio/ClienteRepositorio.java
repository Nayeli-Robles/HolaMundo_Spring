package com.farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
