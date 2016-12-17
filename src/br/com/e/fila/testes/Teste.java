package br.com.e.fila.testes;

import br.com.e.bean.Aluno;
import br.com.e.fila.Fila;

public class Teste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Aluno aluno = new Aluno();

		fila.insere(aluno);

		fila.remove();

		if (fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
}
