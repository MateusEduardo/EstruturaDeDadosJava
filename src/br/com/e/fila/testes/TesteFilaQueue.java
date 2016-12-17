package br.com.e.fila.testes;

import java.util.LinkedList;
import java.util.Queue;

import br.com.e.bean.Aluno;

public class TesteFilaQueue {
	public static void main(String[] args) {

		Queue fila = new LinkedList();

		Aluno aluno = new Aluno();
		fila.offer(aluno);
		System.out.println(fila.size());

		Aluno alunoRemovido = (Aluno) fila.poll();

		System.out.println(fila.size());

		if (fila.isEmpty()) {
			System.out.println("Fila Vazia");
		}
	}
}
