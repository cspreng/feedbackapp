package com.feedbackapp.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.feedbackapp.feedbackapp.models.Avaliacao;
import com.feedbackapp.feedbackapp.models.Colaborador;

public interface AvaliacaoRepository extends CrudRepository<Avaliacao, String>{
	Iterable<Avaliacao> findByColaborador (Colaborador colaborador);
	Avaliacao findByCodigo(long codigo);
}
