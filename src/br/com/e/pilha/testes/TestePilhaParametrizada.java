package br.com.e.pilha.testes;

import br.com.e.bean.Peca;
import br.com.e.pilha.PilhaParametrizada;

public class TestePilhaParametrizada {

	public static void main(String[] args) {
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		Peca peca = new Peca();
		pilhaDePecas.insere(peca);
		Peca pecaRemovida = pilhaDePecas.remove();
		if (peca != pecaRemovida) {
			System.out.println("Erro: a peça removida não é igual a que foi inserida");
		}
		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		}
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		pilhaDeString.insere("Rafael Cosentino");
		pilhaDeString.insere("Ana de Césaro");
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
	}
}