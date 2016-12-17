package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TestePrint {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("teste");

		Vetor lista = new Vetor();
		lista.printa(aluno);
	}
}
