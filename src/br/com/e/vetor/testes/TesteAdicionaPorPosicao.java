package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		double comeco = System.currentTimeMillis();
		
		Vetor lista = new Vetor();
		for (int i = 0; i < 100; i++) {
			Aluno a1 = new Aluno();
			a1.setNome("Teste" + (i + 1));
			if (i == 2) {
				lista.adiciona(0, a1);
			} else {
				lista.adiciona(a1);
			}
		}

		
		double fim = System.currentTimeMillis();
		System.out.println((fim - comeco)/1000);
	}

}
