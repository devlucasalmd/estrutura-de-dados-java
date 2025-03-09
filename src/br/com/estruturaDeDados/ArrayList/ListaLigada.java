package br.com.estruturaDeDados.ArrayList;

public class ListaLigada {

	
	private Celula primeira = null;
	private int totalDeElementos = 0;
	
	public void adicionaaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		
		this.primeira = nova;		
		this.totalDeElementos++;
	
	}
	
	public void adiciona(Object elemento) {
		
	}
	
	public void adicionaNaPosicao(int posicao, Object elemento){
		
	}
	
	public Object pega(int posicao){
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object obj) {		
		return false;	
	}

	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[] - Lista Vazia!"
		}
	}
}
