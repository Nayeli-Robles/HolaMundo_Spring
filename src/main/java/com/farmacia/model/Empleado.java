package com.farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEmpleado;
	
	@Column(nullable = false, length = 8, unique = true)
	private String dniEmpleado;
	
	@Column(nullable = false, length = 40)
	private String nombreEmpleado;
	
	@Column(nullable = false, length = 40)
	private String apellidoEmpleado;
	
	@Column(nullable = false, length = 9)
	private String telefonoEmpleado;
	
	@Column(nullable = false, length = 40)
	private String correoEmpleado;
	
	@Column(nullable = false, length = 40)
	private String direccionEmpleado;
	
	@Column(nullable = false, length = 20)
	private String tipoUsuario;
	
	@Column(nullable = false, length = 20, unique = true)
	private String nombreUsuario;
	
	@Column(nullable = false, length = 20)
	private String passwordUsuario;

	public Empleado(int codEmpleado, String dniEmpleado, String nombreEmpleado, String apellidoEmpleado,
			String telefonoEmpleado, String correoEmpleado, String direccionEmpleado, String tipoUsuario,
			String nombreUsuario, String passwordUsuario) {
		super();
		this.codEmpleado = codEmpleado;
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.tipoUsuario = tipoUsuario;
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
	}

	public Empleado() {
		super();
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public String getCorreoEmpleado() {
		return correoEmpleado;
	}

	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	
}
