package com.feedbackapp.feedbackapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HabilidadesController {
	@RequestMapping("/habilidades")
	public String form() {
		return "colaborador/habilidades2";
		
	}

}