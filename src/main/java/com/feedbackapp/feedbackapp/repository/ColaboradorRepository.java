package com.feedbackapp.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.feedbackapp.feedbackapp.models.Colaborador;

public interface ColaboradorRepository extends CrudRepository<Colaborador, String>{
	Colaborador findByCodigo(long codigo);
}
