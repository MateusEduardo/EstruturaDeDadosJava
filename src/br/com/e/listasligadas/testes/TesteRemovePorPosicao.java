package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Ana");
		lista.adiciona("Camila");
		lista.remove(1);
		System.out.println(lista);
	}
}
