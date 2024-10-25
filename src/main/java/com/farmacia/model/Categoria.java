package com.farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numCategoria;
	
	@Column(nullable = false, length = 40)
	private String nombreCategoria;

	public Categoria(int numCategoria, String nombreCategoria) {
		super();
		this.numCategoria = numCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	public Categoria() {
		super();
	}

	public int getNumCategoria() {
		return numCategoria;
	}

	public void setNumCategoria(int numCategoria) {
		this.numCategoria = numCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	
}
