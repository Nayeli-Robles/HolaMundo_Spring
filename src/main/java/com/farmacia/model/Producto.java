package com.farmacia.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,length = 60)
	private String nombre;
	
	@Column(nullable = false,length = 60)
	private String marca;
	
	@Column(nullable = false,length = 60)
	private String pais;
	
	@Column(nullable = false)
	private float precio;

	//=====================================================
	
	public Producto(Long id, String nombre, String marca, String pais, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.pais = pais;
		this.precio = precio;
	}
	//=====================================================
	
	public Producto() {
		super();
	}

	//=====================================================
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
