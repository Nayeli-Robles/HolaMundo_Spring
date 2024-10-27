package com.farmacia.model;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(nullable = false, length = 20, unique = true)
	private String nombreUsuario;
	
	@Column(nullable = false, length = 8)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "rol", joinColumns = @JoinColumn(name = "UsuarioId", referencedColumnName = "idUsuario"),
	inverseJoinColumns = @JoinColumn(name  = "Rolid",referencedColumnName = "idRol"))
	private Collection<Rol> rol;

	public Usuario(Integer idUsuario, String nombreUsuario, String password, Collection<Rol> rol) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.rol = rol;
	}

	public Usuario(String nombreUsuario, String password, Collection<Rol> rol) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.rol = rol;
	}

	public Usuario() {
		super();
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

	public Collection<Rol> getRol() {
		return rol;
	}

	public void setRol(Collection<Rol> rol) {
		this.rol = rol;
	}
	
	
}
