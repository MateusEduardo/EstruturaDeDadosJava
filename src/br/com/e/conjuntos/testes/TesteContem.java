package br.com.e.conjuntos.testes;

import java.util.List;

import br.com.e.conjuntos.ConjuntoEspalhamento;

public class TesteContem {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Mateus");
		conjunto.adiciona("Emanuele");
		conjunto.adiciona("Estevan");
		conjunto.adiciona("Patricia");
		conjunto.adiciona("Alex");
		
		List<String> palavras = conjunto.pegaTodas();
		
		System.out.println(palavras.contains("Mateus"));
		
	}
}
