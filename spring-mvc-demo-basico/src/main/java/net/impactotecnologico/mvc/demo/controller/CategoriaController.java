package net.impactotecnologico.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.impactotecnologico.mvc.demo.model.Categoria;

@Controller
public class CategoriaController {

	@RequestMapping(path = { "/categoria" }, method = RequestMethod.GET)
	public String sayHello(Model model) {

		Categoria c = new Categoria(1, "Nombre ejemplo");

		model.addAttribute("nombre", c.getNombre());
		model.addAttribute("categoria", c);

		return "categoria";
	}
}