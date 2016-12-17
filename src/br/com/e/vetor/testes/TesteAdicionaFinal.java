package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TesteAdicionaFinal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("Marcelo");
		a2.setNome("Maria");

		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);

		System.out.println(lista);
	}
}
