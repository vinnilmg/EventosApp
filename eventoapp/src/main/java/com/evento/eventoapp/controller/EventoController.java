package com.evento.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}

}
