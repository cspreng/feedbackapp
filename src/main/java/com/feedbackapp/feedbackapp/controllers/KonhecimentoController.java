package com.feedbackapp.feedbackapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feedbackapp.feedbackapp.models.Avaliacao;
import com.feedbackapp.feedbackapp.models.Colaborador;
import com.feedbackapp.feedbackapp.repository.AvaliacaoRepository;
import com.feedbackapp.feedbackapp.repository.ColaboradorRepository;

public class KonhecimentoController {

	@Autowired
	private ColaboradorRepository cr;
	
	@Autowired
	private AvaliacaoRepository ar;
	
	@RequestMapping(value="/conhecimentos", method=RequestMethod.GET)
	public ModelAndView conhecimento(@RequestParam("codigo")long codigo) {
		Colaborador colaborador = cr.findByCodigo(codigo);
		ModelAndView mv= new ModelAndView("colaborador/conhecimento1");
		mv.addObject("colaborador", colaborador);
		
		Iterable<Avaliacao> avaliacaos = ar.findByColaborador(colaborador);
		mv.addObject("avaliacao", avaliacaos);
		System.out.println("colaborador" + colaborador);
		return mv;		
	}
	
	@RequestMapping(value="/conhecimentos", method=RequestMethod.POST)
	public String conhecimentorPost(@RequestParam("codigo")long codigo, Avaliacao avaliacao) {
		Colaborador colaborador = cr.findByCodigo(codigo);
		avaliacao.setColaborador(colaborador);
		ar.save(avaliacao);
		return "redirect:/";		
	}
	
}
