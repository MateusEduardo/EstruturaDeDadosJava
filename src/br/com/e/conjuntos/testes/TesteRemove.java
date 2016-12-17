package br.com.e.conjuntos.testes;

import java.util.List;

import br.com.e.conjuntos.ConjuntoEspalhamento;

public class TesteRemove {

	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		// adicionando
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Fabricio");
		
		List<String> palavras = conjunto.pegaTodas();
		System.out.println("antes de remover");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		// removendo
		conjunto.remove("Rafael");
		
		palavras = conjunto.pegaTodas();
		
		System.out.println("depois de remover");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}