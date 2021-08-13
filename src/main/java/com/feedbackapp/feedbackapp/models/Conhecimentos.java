package com.feedbackapp.feedbackapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Conhecimentos {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private int abordagem;	
	private int venda;	
	private int tecnologia;	
	private int sistema;
	
	@ManyToOne
	private Avaliacao avaliacao;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getAbordagem() {
		return abordagem;
	}
	public void setAbordagem(int abordagem) {
		this.abordagem = abordagem;
	}
	public int getVenda() {
		return venda;
	}
	public void setVenda(int venda) {
		this.venda = venda;
	}
	public int getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(int tecnologia) {
		this.tecnologia = tecnologia;
	}
	public int getSistema() {
		return sistema;
	}
	public void setSistema(int sistema) {
		this.sistema = sistema;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
