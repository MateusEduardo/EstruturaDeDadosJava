package br.com.e.conjuntos.testes;

import java.util.List;

import br.com.e.conjuntos.ConjuntoEspalhamento;

public class TesteAdiciona {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Rafaela");
		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
