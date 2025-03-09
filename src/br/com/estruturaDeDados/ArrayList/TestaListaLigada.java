package br.com.estruturaDeDados.ArrayList;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adicionaaNoComeco("Mauricio");
		System.out.println(lista);
		lista.adicionaaNoComeco("Leandro");
		System.out.println(lista);
		lista.adicionaaNoComeco("Paulo");
		
	}

}
