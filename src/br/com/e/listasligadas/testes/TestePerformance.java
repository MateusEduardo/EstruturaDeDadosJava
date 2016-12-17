package br.com.e.listasligadas.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {
	public static void main(String[] args) {

		ArrayList<String> vetor = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		int numeroDeElementos = 400;

		// ADICIONADO NO COMEÇO
		long inicio = System.currentTimeMillis();

		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.add(0, "" + i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Vetor adiciona no começo: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.add(0, "" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada adiciona no começo: " + (fim - inicio) / 1000.0);

		System.out.println("#######################################");
		System.out.println("");

		// ADICIONADO NO MEIO
		inicio = System.currentTimeMillis();

		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.add(numeroDeElementos / 2, "" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor adiciona no meio: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.add(numeroDeElementos / 2, "" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada adiciona no meio: " + (fim - inicio) / 1000.0);

		System.out.println("#######################################");
		System.out.println("");

		// Adiciona no final
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.add(numeroDeElementos -1, "" + i);
		}
		System.out.println(vetor);
		fim = System.currentTimeMillis();
		System.out.println("Vetor adiciona no Final: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.add(numeroDeElementos -1, "" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada adiciona no Final: " + (fim - inicio) / 1000.0);

		System.out.println("#######################################");
		System.out.println("");

		// REMOVENDO DO COMEÇO
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor remove do começo: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada remove do começo: " + (fim - inicio) / 1000.0);

		System.out.println("#######################################");
		System.out.println("");

		// REMOVE DO MEIO
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.remove(numeroDeElementos / 2);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor remove do meio: " + (fim - inicio) / 1000.0);

		long inicio1 = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.remove(numeroDeElementos / 2);
		}
		long fim1 = System.currentTimeMillis();
		System.out.println("Lista Ligada remove do meio: " + (fim1 - inicio1) / 1000.0);

		System.out.println("#######################################");
		System.out.println("");
		//
		// // Removendo do Final
		// inicio = System.currentTimeMillis();
		// for (int i = 0; i < numeroDeElementos; i++) {
		// vetor.remove(numeroDeElementos-1);
		// }
		// fim = System.currentTimeMillis();
		// System.out.println("Vetor remove do final: " + (fim - inicio) /
		// 1000.0);
		//
		// inicio = System.currentTimeMillis();
		// for (int i = 0; i < numeroDeElementos; i++) {
		// lista.remove(numeroDeElementos-1);
		// }
		// fim = System.currentTimeMillis();
		// System.out.println("Lista Ligada remove do final: " + (fim - inicio)
		// / 1000.0);
		//
		// System.out.println("#######################################");
		// System.out.println("");

		// PERCORRENDO
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada percorrendo: " + (fim - inicio) / 1000.0);

		System.out.println("#######################################");

		System.out.println(fim/1000.0);
	}
}