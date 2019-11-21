package com.nevent.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("mensaje", "Its Works");
		return "home";
	}
	
	@RequestMapping("/pedidos")
	public String pedidos(Model model) {
		model.addAttribute("mensaje", "Its Works");
		return "pedidos";
	}
}
