package br.com.e.listasligadas.testes;

import br.com.e.listasligadas.ListaLigada;

public class TesteAdicionaNoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Ana");
		System.out.println(lista);
	}
}
