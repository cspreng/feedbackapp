package com.feedbackapp.feedbackapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feedbackapp.feedbackapp.models.Avaliacao;
import com.feedbackapp.feedbackapp.models.Colaborador;
import com.feedbackapp.feedbackapp.models.Conhecimentos;
import com.feedbackapp.feedbackapp.repository.AvaliacaoRepository;
import com.feedbackapp.feedbackapp.repository.ColaboradorRepository;
import com.feedbackapp.feedbackapp.repository.ConhecimentosRepository;

@Controller
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository cr;
	
	@Autowired
	private AvaliacaoRepository ar;
	
	@Autowired
	private ConhecimentosRepository co;
	
	
	
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
	


	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/feedback", method=RequestMethod.GET)
	public ModelAndView feedback(@RequestParam("codigo")long codigo) {
		Colaborador colaborador = cr.findByCodigo(codigo);
		ModelAndView mv= new ModelAndView("Feedback/feedback");
		mv.addObject("colaborador", colaborador);
		
		Iterable<Avaliacao> avaliacaos = ar.findByColaborador(colaborador);
		mv.addObject("avaliacaos", avaliacaos);
		
		return mv;		
	}
	
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public String feedbackPost(@RequestParam("codigo")long codigo, Avaliacao avaliacao) {
		Colaborador colaborador = cr.findByCodigo(codigo);
		avaliacao.setColaborador(colaborador);
		ar.save(avaliacao);
		return "redirect:/{codigo}";
	
	}
	
	
	
	
	
	@RequestMapping(value="/conhecimentos", method=RequestMethod.GET)
	public ModelAndView conhecimentos(@RequestParam("codigo")long codigo) {
		Avaliacao avaliacao = ar.findByCodigo(codigo);
		ModelAndView mv= new ModelAndView("Feedback/conhecimentos");
		mv.addObject("avaliacao", avaliacao);
		
		Iterable<Conhecimentos> conhecimentoss = co.findByAvaliacao(avaliacao);
		mv.addObject("conhecimentoss", conhecimentoss);
		
		return mv;		
	}
	
	@RequestMapping(value="/conhecimentos", method=RequestMethod.POST)
	public String conhecimentosPost(@RequestParam("codigo")long codigo, Conhecimentos conhecimentos) {
		Avaliacao Avaliacao = ar.findByCodigo(codigo);
		conhecimentos.setAvaliacao(Avaliacao);
		co.save(conhecimentos);
		return "redirect:/{codigo}";
	}
}