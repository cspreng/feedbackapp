package com.feedbackapp.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.feedbackapp.feedbackapp.models.Avaliacao;
import com.feedbackapp.feedbackapp.models.Conhecimentos;

public interface ConhecimentosRepository extends CrudRepository <Conhecimentos, String> {
	Iterable<Conhecimentos> findByAvaliacao(Avaliacao avaliacao);
	Conhecimentos findByCodigo (long codigo);
}