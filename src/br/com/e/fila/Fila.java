package br.com.e.fila;

import java.util.LinkedList;
import java.util.List;

import br.com.e.bean.Aluno;

public class Fila {

	private List<Aluno> alunos = new LinkedList<Aluno>();


	public void insere(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Aluno remove() {
		return this.alunos.remove(0);
	}

	public boolean vazia() {
		return this.alunos.size() == 0;
		/*
		 * Modo alternativo: if (this.totalDeAlunos == 0) { return true; }
		 * return false;
		 */

	}

}
