package br.com.estruturaDeDados;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public boolean equals(Object obj){
		Aluno outroAluno = (Aluno) obj;
		return outroAluno.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
