package br.com.e.bean;

public class Carro {

	String nome;

	public Carro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {

		return "Carro: " + this.nome;
	}
}
