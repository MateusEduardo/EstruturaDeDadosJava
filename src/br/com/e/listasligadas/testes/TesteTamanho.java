package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteTamanho {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Ana");
		System.out.println(lista.getTamanho());
		lista.adiciona("Camila");
		System.out.println(lista.getTamanho());
	}
}