package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona(0, "Ana");
		lista.adiciona(1, "Camila");
		System.out.println(lista);
	}
}
