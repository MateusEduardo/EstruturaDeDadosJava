package br.com.e.listasligadas.testes;

import java.util.LinkedList;

import br.com.e.bean.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno marcos = new Aluno();
		marcos.setNome("marcos silveira");
		Aluno rafael = new Aluno();
		rafael.setNome("rafael cosentino");
		Aluno fiodor = new Aluno();
		fiodor.setNome("fiodor dostoievski");

		LinkedList<Object> listaLigada = new LinkedList<Object>();
		listaLigada.add(marcos);
		listaLigada.add(rafael);
		listaLigada.add(1, fiodor);
		for (int i = 0; i < listaLigada.size(); i++) {
			System.out.println(listaLigada.get(i));
		}
	}
}
