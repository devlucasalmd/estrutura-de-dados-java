package br.com.estruturaDeDados.ArrayList;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adicionaNoComeco("Mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("Leandro");
		System.out.println(lista);
		lista.adicionaNoComeco("Paulo");
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);

		Object x = lista.pega(1);
		System.out.println(x);

		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
	}

}
