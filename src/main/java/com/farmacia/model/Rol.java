package com.farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;
	
	@Column(nullable = false, length = 30)
	private String nombreRol;

	public Rol(Integer idRol, String nombreRol) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
	}

	public Rol() {
		super();
	}
	

	public Rol(String nombreRol) {
		super();
		this.nombreRol = nombreRol;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	

}
