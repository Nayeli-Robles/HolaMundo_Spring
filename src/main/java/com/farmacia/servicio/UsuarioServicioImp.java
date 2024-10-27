package com.farmacia.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.farmacia.dto.UsuarioRegistroDTO;
import com.farmacia.model.Rol;
import com.farmacia.model.Usuario;
import com.farmacia.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImp implements UsuarioServicio{
	
	private UsuarioRepositorio usuRepo;
	

	public UsuarioServicioImp(UsuarioRepositorio usuRepo) {
		super();
		this.usuRepo = usuRepo;
	}


	@Override
	public Usuario GuardarUsuario(UsuarioRegistroDTO registroDTO) {
		Usuario usu= new Usuario(registroDTO.getNombreUsuario(), registroDTO.getPassword(), Arrays.asList(new Rol("Rol_user")));
		return usuRepo.save(usu);
	}

}
