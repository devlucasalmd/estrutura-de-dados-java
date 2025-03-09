package br.com.estruturaDeDados.Array;

public class VetorTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Pedro");
		
		Vetor lista = new Vetor();
		
		System.out.println(lista.tamanho());
		System.out.println(lista);				
		
		lista.adiciona(aluno1);
		System.out.println(lista.tamanho());
		System.out.println(lista);
		
		lista.adiciona(aluno2);
		System.out.println(lista.tamanho());		
		System.out.println(lista);
		
	//	System.out.println(lista.contem(aluno1));		
	//	System.out.println(lista.pega(200));
		
		Aluno aluno3 = new Aluno("Fernando");
		
		lista.adicionaNaPosicao(1, aluno3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}
}

