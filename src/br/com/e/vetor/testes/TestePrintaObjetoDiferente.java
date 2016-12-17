package br.com.e.vetor.testes;

import br.com.e.bean.Professor;
import br.com.e.vetor.Vetor;

public class TestePrintaObjetoDiferente {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.setNome("Professor Girafales");
		
		Vetor lista = new Vetor();
		lista.printa(prof);
	}

}
