package br.com.e.bean;

public class AlunoLista {

	private String nome;
	private int idade;
	private AlunoLista proximo;

	/*
	 * quando precisarmos ter uma Lista Ligada de peças de carro, precisaríamos
	 * criar uma classe PecaLista parecidíssima com a AlunoLista, e não
	 * estaríamos reaproveitando código (além de ficar sucetível a copiar e
	 * colar modificações, uma péssima prática de programação, que pode gerar
	 * muitos erros). Em vez de usar essa estrutura engessada, vamos utilizar
	 * uma classe separada como célula [label algumas pessoas gostam de chamar
	 * essa estrutura de nó], evitando a mistura da nossa classe de dados (a
	 * Aluno) da nossa estrutura.
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public AlunoLista getProximo() {
		return proximo;
	}

	public void setProximo(AlunoLista proximo) {
		this.proximo = proximo;
	}

}
