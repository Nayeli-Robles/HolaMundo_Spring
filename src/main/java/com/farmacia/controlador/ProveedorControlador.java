package com.farmacia.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.farmacia.model.Empleado;
import com.farmacia.model.Proveedor;
import com.farmacia.servicio.EmpleadoServicio;
import com.farmacia.servicio.ProveedorServicio;

@Controller
@RequestMapping("/VistasProveedor")
public class ProveedorControlador {
	
	@Autowired
	private ProveedorServicio provSer;
	
	@RequestMapping("/ProvList")
	public String ListadoProveedor(Model modelo) {
		List<Proveedor> listadoProveedores = provSer.listAll();
		modelo.addAttribute("listadoProveedores", listadoProveedores);
		return "/VistasProveedor/ProveedorListado";
	}
	
	@RequestMapping("/RegistroProv")
	public String RegistrarProveedor(Model modelo) {
		Proveedor prov= new Proveedor();
		modelo.addAttribute("prov", prov);
		return "/VistasProveedor/RegistrarProveedor";
	}
	
	@RequestMapping(value = "/GuardarProv", method = RequestMethod.POST)
	public String GuardarProveedor(@ModelAttribute("prov") Proveedor prov) {
		provSer.save(prov);
		return "redirect:/VistasProveedor/ProvList";
	}
	
	@RequestMapping("/EditarProv/{codProveedor}")
	public ModelAndView EditarProveedor(@PathVariable(name = "codProveedor")Integer codProveedor) {
		ModelAndView modelo = new ModelAndView("EditarProveedor");
		Proveedor prov = provSer.get(codProveedor);
		modelo.addObject("prov", prov);
		return modelo;
	}
	
	@RequestMapping("/EliminarProv/{codProveedor}")
	public String EliminarProveedor(@PathVariable(name = "codProveedor")Integer codProveedor) {
		provSer.delete(codProveedor);
		return "redirect:/VistasProveedor/ProvList";
	}

}
