package com.farmacia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{

}
