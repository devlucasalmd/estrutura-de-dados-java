package br.com.estruturaDeDados.Pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Stack<String> stack = new Stack<String>();
		
		System.out.println(pilha.vazia());
		
		pilha.insere("Mauricio");
		System.out.println(pilha);
	
		System.out.println(pilha.vazia());
		
		pilha.insere("Guilherme");
		System.out.println(pilha);
	
		String r1 = pilha.remove();
		System.out.println(r1);
		
		String r2 = pilha.remove();
		System.out.println(r2);
		
		System.out.println(pilha);
		
		stack.push("Leandro");
		stack.push("Marcelo");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		String nome = stack.peek();
		System.out.println(nome);
	}
}
