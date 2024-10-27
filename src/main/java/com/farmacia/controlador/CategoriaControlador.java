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

import com.farmacia.model.Categoria;
import com.farmacia.servicio.CategoriaServicio;

@Controller
@RequestMapping("/VistasCategoria")
public class CategoriaControlador {
	
	@Autowired
	private CategoriaServicio cateSer;
	
	@RequestMapping("/CateList")
	public String ListadoCategoria(Model modelo) {
		List<Categoria> listadoCategoria = cateSer.listAll();
		modelo.addAttribute("listadoCategoria", listadoCategoria);
		return "/VistasCategoria/CategoriaListado";
	}
	
	
	@RequestMapping("/RegistroCate")
	public String RegistrarCategoria(Model modelo) {
		Categoria cate= new Categoria();
		modelo.addAttribute("cate", cate);
		return "/VistasCategoria/RegistrarCategoria";
	}
	
	
	@RequestMapping(value = "/GuardarCate", method = RequestMethod.POST)
	public String GuardarCategoria(@ModelAttribute("cate") Categoria cate) {
		cateSer.save(cate);
		return "redirect:/VistasCategoria/CateList";
	}
	

	@RequestMapping("/EditarCate/{numCategoria}")
	public ModelAndView EditarCategoria(@PathVariable(name = "numCategoria")Integer numCategoria) {
		ModelAndView modelo = new ModelAndView("/VistasCategoria/EditarCategoria");
		Categoria cate = cateSer.get(numCategoria);
		modelo.addObject("cate", cate);
		return modelo;
	}
	
	
	@RequestMapping("/EliminarCate/{numCategoria}")
	public String EliminarCategoria(@PathVariable(name = "numCategoria")Integer numCategoria) {
		cateSer.delete(numCategoria);
		return "redirect:/VistasCategoria/CateList";
	}
	
}
