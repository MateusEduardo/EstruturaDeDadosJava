package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TestaRemovePorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Mateus");
		Aluno a2 = new Aluno();
		a2.setNome("Teste");
		Aluno a3 = new Aluno();
		a3.setNome("Teste2");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
	}
}
