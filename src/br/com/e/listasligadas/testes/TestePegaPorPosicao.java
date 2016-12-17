package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TestePegaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Ana");
		System.out.println(lista.getObjetoPorPosicao(0));
		System.out.println(lista.getObjetoPorPosicao(1));
	}
}
