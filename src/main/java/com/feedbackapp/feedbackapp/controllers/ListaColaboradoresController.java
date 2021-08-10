package com.feedbackapp.feedbackapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListaColaboradoresController {

	@RequestMapping("/listaColaboradores")
	public String form() {
		return "colaborador/listaColaboradores";
	}
}
