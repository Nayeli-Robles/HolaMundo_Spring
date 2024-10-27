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
import com.farmacia.servicio.EmpleadoServicio;
@Controller
@RequestMapping("/VistasEmpleado")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoServicio empSer;
	
	@RequestMapping("/EmpList")
	public String LsitadoEmpleado(Model modelo) {
		List<Empleado> listadoEmpleados = empSer.listAll();
		modelo.addAttribute("listadoEmpleados", listadoEmpleados);
		return "/VistasEmpleado/EmpleadoListado";
	}
	
	@RequestMapping("/RegistroEmp")
	public String RegistrarEmpleado(Model modelo) {
		Empleado emp= new Empleado();
		modelo.addAttribute("emp", emp);
		return "/VistasEmpleado/RegistrarEmpleado";
	}
	
	@RequestMapping(value = "/GuardarEmp", method = RequestMethod.POST)
	public String GuardarEmpleado(@ModelAttribute("emp") Empleado emp) {
		empSer.save(emp);
		return "redirect:/VistasEmpleado/EmpList";
	}
	
	@RequestMapping("/EditarEmp/{codEmpleado}")
	public ModelAndView EditarEmpleado(@PathVariable(name = "codEmpleado")Integer codEmpleado) {
		ModelAndView modelo = new ModelAndView("/VistasEmpleado/EditarEmpleado");
		Empleado emp = empSer.get(codEmpleado);
		modelo.addObject("emp", emp);
		return modelo;
	}
	
	@RequestMapping("/EliminarEmp/{codEmpleado}")
	public String EliminarEmpleado(@PathVariable(name = "codEmpleado")Integer codEmpleado) {
		empSer.delete(codEmpleado);
		return "redirect:/VistasEmpleado/EmpList";
	}
	
}
