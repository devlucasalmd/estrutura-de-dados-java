package br.com.estruturaDeDados.ArrayList;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		System.out.println("Adicionando Elemento: ");
		lista.adicionaNoComeco("Mauricio");
		System.out.println(lista);
		System.out.println("Adicionando Elemento: ");
		lista.adicionaNoComeco("Leandro");
		System.out.println(lista);
		System.out.println("Adicionando Elemento: ");
		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);
		System.out.println("Adicionando Elemento na 3 posicao: ");
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		System.out.println("Pegando segundo Elemento: ");
		Object x = lista.pega(1);
		System.out.println(x);
		System.out.println("Tamanho da lista: ");
		System.out.println(lista.tamanho());
		System.out.println("Removendo Elemento do comeco: ");
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println("Removendo Elemento do fim: ");
		lista.removeDoFim();
		System.out.println(lista);
		
//		System.out.println("Adicionando na Posicao 2: ");
//		lista.adicionaNaPosicao(1, "Pedro");
//		System.out.println(lista);
		System.out.println("Adicionando no fim: ");
		lista.adicionaNoFim("Cachorro");
		System.out.println(lista);
		System.out.println("A lista contem Lucas: ");
		Object nomeObject = "Lucas";
		if(lista.contem(nomeObject)){
			System.out.println("Contem");
		}
		else {
			System.out.println("Não Contem");
		}
		
		System.out.println("A lista contem Pedro: ");
		Object obj = "Cachorro";
		if(lista.contem(obj)){
			System.out.println("Contem");
		}
		else {
			System.out.println("Não Contem");
		}
		
		System.out.println("Pegando 2º elemento da lista: ");
		System.out.println(lista.pega(1));
		System.out.println("Tamanho da lista: ");
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}

}
