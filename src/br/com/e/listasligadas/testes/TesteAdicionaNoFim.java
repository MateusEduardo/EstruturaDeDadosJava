package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Ana");
		System.out.println(lista);
	}
}
