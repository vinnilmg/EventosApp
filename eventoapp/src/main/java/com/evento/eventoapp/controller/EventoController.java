package com.evento.eventoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evento.eventoapp.model.Evento;
import com.evento.eventoapp.repository.EventoRepository;

@Controller
public class EventoController {
	
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}

	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento) {
		
		eventoRepository.save(evento);
		
		return "redirect:/cadastrarEvento";
	}

}
