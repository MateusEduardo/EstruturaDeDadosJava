package br.com.e.fila.testes;

import br.com.e.bean.Aluno;
import br.com.e.fila.FilaParametrizada;

public class TesteFilaParametrizada {
	public static void main(String[] args) {
		FilaParametrizada<Aluno> filaDeAlunos = new FilaParametrizada<Aluno>();
		Aluno aluno = new Aluno();
		filaDeAlunos.insere(aluno);
		Aluno alunoRemovido = filaDeAlunos.remove();
		if (aluno != alunoRemovido) {
			System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
		}
		if (!filaDeAlunos.vazia()) {
			System.out.println("Erro: A fila não está vazia");
		}
		FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();
		filaDeString.insere("Rafael Cosentino");
		filaDeString.insere("Ana de Césaro");
		System.out.println(filaDeString.remove());
		System.out.println(filaDeString.remove());
	}
}