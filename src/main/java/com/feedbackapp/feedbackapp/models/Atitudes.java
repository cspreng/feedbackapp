package com.feedbackapp.feedbackapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Atitudes {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	
	private int proatividade;	
	private int resiliencia;	
	private int urgencia;	
	private int resultados;	
	private int problema;	
	private int motivacao;	
	private int frequencia;	
	private int equipe;	
	private int interpessoal;	
	private int missao;	
	private int agilidade;	
	private int inteligencia;	
	private int lideranca;	
	private int autoconhecimento;	
	private int autogestao;	
	private int empatia;	
	private int social;	
	private int criatividade;
	
	
	@ManyToOne
	private Avaliacao avaliacao;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getProatividade() {
		return proatividade;
	}
	public void setProatividade(int proatividade) {
		this.proatividade = proatividade;
	}
	public int getResiliencia() {
		return resiliencia;
	}
	public void setResiliencia(int resiliencia) {
		this.resiliencia = resiliencia;
	}
	public int getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}
	public int getResultados() {
		return resultados;
	}
	public void setResultados(int resultados) {
		this.resultados = resultados;
	}
	public int getProblema() {
		return problema;
	}
	public void setProblema(int problema) {
		this.problema = problema;
	}
	public int getMotivacao() {
		return motivacao;
	}
	public void setMotivacao(int motivacao) {
		this.motivacao = motivacao;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	public int getEquipe() {
		return equipe;
	}
	public void setEquipe(int equipe) {
		this.equipe = equipe;
	}
	public int getInterpessoal() {
		return interpessoal;
	}
	public void setInterpessoal(int interpessoal) {
		this.interpessoal = interpessoal;
	}
	public int getMissao() {
		return missao;
	}
	public void setMissao(int missao) {
		this.missao = missao;
	}
	public int getAgilidade() {
		return agilidade;
	}
	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getLideranca() {
		return lideranca;
	}
	public void setLideranca(int lideranca) {
		this.lideranca = lideranca;
	}
	public int getAutoconhecimento() {
		return autoconhecimento;
	}
	public void setAutoconhecimento(int autoconhecimento) {
		this.autoconhecimento = autoconhecimento;
	}
	public int getAutogestao() {
		return autogestao;
	}
	public void setAutogestao(int autogestao) {
		this.autogestao = autogestao;
	}
	public int getEmpatia() {
		return empatia;
	}
	public void setEmpatia(int empatia) {
		this.empatia = empatia;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getCriatividade() {
		return criatividade;
	}
	public void setCriatividade(int criatividade) {
		this.criatividade = criatividade;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
}
