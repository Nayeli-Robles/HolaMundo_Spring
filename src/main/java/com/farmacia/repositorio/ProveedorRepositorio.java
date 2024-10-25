package com.farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Proveedor;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer> {

}
