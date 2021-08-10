package com.feedbackapp.feedbackapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feedbackapp.feedbackapp.models.Avaliacao;
import com.feedbackapp.feedbackapp.models.Colaborador;
import com.feedbackapp.feedbackapp.repository.AvaliacaoRepository;
import com.feedbackapp.feedbackapp.repository.ColaboradorRepository;

@Controller
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository cr;
	
	@Autowired
	private AvaliacaoRepository ar;
	
	@RequestMapping(value="/cadastrarColaborador", method=RequestMethod.GET)
	public String form() {
		return "colaborador/cadastroColaborador";
	}
	
	@RequestMapping(value="/cadastrarColaborador", method=RequestMethod.POST)
	public String form(Colaborador colaborador) {
		
		cr.save(colaborador);
		
		return "redirect:/cadastrarColaborador";
	}
	
	@RequestMapping("/colaboradores")
	public ModelAndView listaColaboradores() {
		ModelAndView mv = new ModelAndView("colaborador/listaColaboradores");
		Iterable<Colaborador> colaboradores = cr.findAll();
		mv.addObject("colaboradores", colaboradores);
		return mv;
		
	}
	
		
	@RequestMapping(value="/colaboradoruni", method=RequestMethod.GET)
	public ModelAndView detalhesColaborador(@RequestParam("codigo")long codigo) {
		Colaborador colaborador = cr.findByCodigo(codigo);
		ModelAndView mv= new ModelAndView("colaborador/detalhesColaborador");
		mv.addObject("colaborador", colaborador);		
		return mv;		
	}
	
	
	
	
}