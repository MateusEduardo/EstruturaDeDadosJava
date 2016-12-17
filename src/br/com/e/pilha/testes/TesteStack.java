package br.com.e.pilha.testes;

import java.util.Stack;

import br.com.e.bean.Peca;

public class TesteStack {
	public static void main(String[] args) {
		Stack pilha = new Stack();

		Peca pecaInsere = new Peca();

		pilha.push(pecaInsere);

		Peca pecaRemove = (Peca) pilha.pop();

		if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia");
		} else {
			System.out.println(pilha);
		}
	}

}
