package com.farmacia.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/RegistroCli")
	public String RegistrarProducto(Model modelo) {
		Cliente cli= new Cliente();
		modelo.addAttribute("cli", cli);
		return "RegistrarCliente";
	}
	
	@RequestMapping(value = "/GuardarCli", method = RequestMethod.POST)
	public String GuardarCliente(@ModelAttribute("cli") Cliente cli) {
		cliSer.save(cli);
		return "redirect:/";
	}
	
	@RequestMapping("/EditarCli/{codCliente}")
	public ModelAndView EditarCliente(@PathVariable(name = "codCliente")Integer codCliente) {
		ModelAndView modelo = new ModelAndView("EditarCliente");
		Cliente cli = cliSer.get(codCliente);
		modelo.addObject("cli", cli);
		return modelo;
	}
	
	@RequestMapping("/EliminarCli/{codCliente}")
	public String EliminarCliente(@PathVariable(name = "codCliente")Integer codCliente) {
		cliSer.delete(codCliente);
		return "redirect:/";
	}
	
}
