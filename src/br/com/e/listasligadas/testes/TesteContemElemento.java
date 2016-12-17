package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteContemElemento {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Ana");
		System.out.println(lista.contemNaFila("Rafael"));
		System.out.println(lista.contemNaFila("Camila"));
	}
}
