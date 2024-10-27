package com.farmacia.servicio;

import com.farmacia.dto.UsuarioRegistroDTO;
import com.farmacia.model.Usuario;

public interface UsuarioServicio {
	
	public Usuario GuardarUsuario(UsuarioRegistroDTO registroDTO);
}
