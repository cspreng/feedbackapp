package com.feedbackapp.feedbackapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Avaliacao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private String motivo;	
	private String datafeddback;

	
		
		
	
	@ManyToOne
	private Colaborador colaborador;
	@OneToMany
	private List<Conhecimentos> conhecimentos;
	@OneToMany
	private List<Habilidades> habilidades;
	@OneToMany
	private List<Atitudes> atitudes;
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDatafeddback() {
		return datafeddback;
	}
	public void setDatafeddback(String datafeddback) {
		this.datafeddback = datafeddback;
	}
	public List<Conhecimentos> getConhecimentos() {
		return conhecimentos;
	}
	public void setConhecimentos(List<Conhecimentos> conhecimentos) {
		this.conhecimentos = conhecimentos;
	}
	public List<Habilidades> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidades> habilidades) {
		this.habilidades = habilidades;
	}
	public List<Atitudes> getAtitudes() {
		return atitudes;
	}
	public void setAtitudes(List<Atitudes> atitudes) {
		this.atitudes = atitudes;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
}

	
	