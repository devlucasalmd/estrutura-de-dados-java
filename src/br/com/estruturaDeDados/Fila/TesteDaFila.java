package br.com.estruturaDeDados.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		Queue<String> filaDoJava = new LinkedList<String>();
		
		fila.adiciona("Mauricio");
		fila.adiciona("Guilherme");

		filaDoJava.add("Matheus");
		String x2 = filaDoJava.poll();
		System.out.println(x2);
		
		System.out.println(fila);
		
		String x1 = fila.remove();
		System.out.println(x1);
		System.out.println(fila);
	}

}
