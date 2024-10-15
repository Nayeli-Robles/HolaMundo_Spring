package com.farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codProveedor;
	
	@Column(nullable = false, length = 11, unique = true)
	private String rucProveedor;
	
	@Column(nullable = false, length = 40)
	private String nombreProveedor;
	
	@Column(nullable = false, length = 9)
	private String telefonoProveedor;
	
	@Column(nullable = false, length = 40)
	private String direccionProveedor;
	
	@Column(nullable = false, length = 40)
	private String correoProveedor;
	
	@Column(nullable = false, length = 40)
	private String webProveedor;

	public Proveedor(int codProveedor, String rucProveedor, String nombreProveedor, String telefonoProveedor,
			String direccionProveedor, String correoProveedor, String webProveedor) {
		super();
		this.codProveedor = codProveedor;
		this.rucProveedor = rucProveedor;
		this.nombreProveedor = nombreProveedor;
		this.telefonoProveedor = telefonoProveedor;
		this.direccionProveedor = direccionProveedor;
		this.correoProveedor = correoProveedor;
		this.webProveedor = webProveedor;
	}

	public Proveedor() {
		super();
	}

	public int getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getRucProveedor() {
		return rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getTelefonoProveedor() {
		return telefonoProveedor;
	}

	public void setTelefonoProveedor(String telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	public String getDireccionProveedor() {
		return direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public String getCorreoProveedor() {
		return correoProveedor;
	}

	public void setCorreoProveedor(String correoProveedor) {
		this.correoProveedor = correoProveedor;
	}

	public String getWebProveedor() {
		return webProveedor;
	}

	public void setWebProveedor(String webProveedor) {
		this.webProveedor = webProveedor;
	}
	
	
}
