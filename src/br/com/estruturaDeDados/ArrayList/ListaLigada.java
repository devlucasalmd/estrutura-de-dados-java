package br.com.estruturaDeDados.ArrayList;

import java.util.Iterator;

public class ListaLigada {

	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		
		this.primeira = nova;		
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		
		this.totalDeElementos++;
	
	}
	
	public void adiciona(int posicao, Object elemento) {
	
	if (posicao == 0) {
		adicionaNoComeco(elemento);		
	} else if (this.totalDeElementos == 0) {
		adicionaNoComeco(elemento);
	} else {
		Celula nova = new Celula(elemento, null);
		
		this.ultima.setProximo(nova);
		this.ultima = nova;		
		this.totalDeElementos++;
		}	
	}
	
	public void adicionaNaPosicao(int posicao, Object elemento){
		
		Celula anterior = this.pegaCelula(posicao - 1);
		Celula nova = new Celula(elemento, anterior.getProximo());
		
		anterior.setProximo(nova);
		
		this.totalDeElementos++;
		
	}
	
	public Celula pegaCelula(int posicao){
		
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição inexistente!");
		}
		
		Celula atual = primeira;
		
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}	
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	
	public void remove(int posicao) {
		
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista vazia!");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object obj) {		
		return false;	
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao > 0 && posicao < this.totalDeElementos;
	}
	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[] - Lista Vazia!";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for(int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();			
		}
		
		builder.append("]");
		
		return builder.toString();

	}
}
