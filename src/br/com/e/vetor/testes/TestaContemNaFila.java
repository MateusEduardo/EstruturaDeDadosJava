package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TestaContemNaFila {
	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setNome("Mateus");
		Aluno a2 = new Aluno();
		a2.setNome("auhsd");
		Aluno a3 = new Aluno();
		a3.setNome("euhueahs");
		Aluno a4 = new Aluno();
		a4.setNome("Mateus");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		
		System.out.println(lista.contemNaFila(a1));
		System.out.println(lista.getTamanho());
		System.out.println(lista.getObjetoPorPosicao(0));
	}
}
