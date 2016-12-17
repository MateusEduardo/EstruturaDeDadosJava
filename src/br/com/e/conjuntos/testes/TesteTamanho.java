package br.com.e.conjuntos.testes;

import br.com.e.conjuntos.ConjuntoEspalhamento;

public class TesteTamanho {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

		conjunto.adiciona("Mateus");
		conjunto.adiciona("Teste");
		conjunto.adiciona("Marcela");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Fabrícia");
		conjunto.adiciona("Teste");

		System.out.println(conjunto.tamanho());
	}
}
