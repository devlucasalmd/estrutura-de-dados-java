package br.com.estruturaDeDados.Array;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	
	public void adiciona(Aluno aluno) {
		
		this.garanteEspaco();
		
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	public void adicionaNaPosicao(int posicao, Aluno aluno) {
		
		this.garanteEspaco();
		
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		
		for(int i = totalDeAlunos - 1; i >= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
					
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	
	public Aluno pega(int posicao) {
		
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		
		totalDeAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
		
		for(int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i])){
				return true;
			}
		}		
		return false;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;		
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
	
	public int tamanho() {
		return totalDeAlunos;
	}
	
	public void garanteEspaco() {
		if(totalDeAlunos == alunos.length) {
			Aluno[] novoVetor = new Aluno[alunos.length*2];
			for(int i = 0; i < alunos.length; i++) {
				novoVetor[i] = alunos[i];
			}
			this.alunos = novoVetor;
		}
	}
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
