package com.farmacia.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmacia.dto.UsuarioRegistroDTO;
import com.farmacia.servicio.UsuarioServicio;

@Controller
@RequestMapping("/VistasLogin")
public class RegistroUsuarioControlador {

	private UsuarioServicio usuSer;

	public RegistroUsuarioControlador(UsuarioServicio usuSer) {
		super();
		this.usuSer = usuSer;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	
	@GetMapping
	public String MostrarRegistro() {
		return "/VistasLogin/Registro";
	}
	
	@PostMapping
	public String RegistrarUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuSer.GuardarUsuario(registroDTO);
		return "redirect:/VistasLogin/Registro?exito";
	}
}
