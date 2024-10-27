package com.farmacia.dto;

public class UsuarioRegistroDTO {
	private Integer idUsuario;
	private String nombreUsuario;
	private String password;
	
	public UsuarioRegistroDTO(Integer idUsuario, String nombreUsuario, String password) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	
	public UsuarioRegistroDTO(String nombreUsuario, String password) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	
	public UsuarioRegistroDTO(String nombreUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioRegistroDTO() {
		super();
	}

	

}
