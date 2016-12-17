package br.com.e.conjuntos.testes;

import br.com.e.conjuntos.ConjuntoEspalhamentoGenerico;

public class TesteConjuntoGenerico {
	public static void main(String[] args) {
		ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Rafaela");
		System.out.println(conjunto.pegaTodas());
	}
}
