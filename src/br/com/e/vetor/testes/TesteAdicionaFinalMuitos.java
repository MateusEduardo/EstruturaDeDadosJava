package br.com.e.vetor.testes;

import br.com.e.bean.Aluno;
import br.com.e.vetor.Vetor;

public class TesteAdicionaFinalMuitos {

	public static void main(String[] args) {
		double tempoInicial = System.currentTimeMillis();
		
		
		Vetor lista = new Vetor();
		for(int i =0; i<30000000; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome("Aluno"+(i+1));
			lista.adiciona(aluno);
		}
		
		double tempoFinal = System.currentTimeMillis();
		double tempo = (tempoFinal - tempoInicial)/1000;
		System.out.println(tempo);
	}
}
