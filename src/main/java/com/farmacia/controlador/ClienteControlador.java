package com.farmacia.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmacia.model.Cliente;
import com.farmacia.servicio.ClienteServicio;

@Controller
public class ClienteControlador {
	
	@Autowired
	private ClienteServicio cliSer;
	
	@RequestMapping("/")
	public String PaginaInicio(Model modelo) {
		List<Cliente> listadoClientes = cliSer.listAll();
		modelo.addAttribute("listadoClientes", listadoClientes);
		return "index";
	}
}
