package com.feedbackapp.feedbackapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Habilidades {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private int telefone;	
	private int whatsapp;	
	private int balcao;	
	private int cliente;	
	private int caixa;	
	private int fecharVenda;
	
	
	@ManyToOne
	private Avaliacao avaliacao;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(int whatsapp) {
		this.whatsapp = whatsapp;
	}
	public int getBalcao() {
		return balcao;
	}
	public void setBalcao(int balcao) {
		this.balcao = balcao;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getCaixa() {
		return caixa;
	}
	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}
	public int getFecharVenda() {
		return fecharVenda;
	}
	public void setFecharVenda(int fecharVenda) {
		this.fecharVenda = fecharVenda;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
