package br.com.estruturaDeDados;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
//		for(int i = 0; i < alunos.length; i++) {
//			if(alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
		
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	public Aluno pega(int posicao) {
		
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		
		for(int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i])){
				return true;
			}
		}		
		return false;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
	public int tamanho() {
		return totalDeAlunos;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
