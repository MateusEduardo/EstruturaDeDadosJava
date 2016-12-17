package br.com.e.listasligadas;

import br.com.e.bean.Celula;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;

	private int totalDeElementos;

	public void adiciona(Object objeto) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(objeto);
		} else {
			Celula nova = new Celula(objeto);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public void adiciona(int posicao, Object objeto) {
		if (posicao == 0) { // No começo.
			this.adicionaNoComeco(objeto);
		} else if (posicao == this.totalDeElementos) { // No fim.
			this.adiciona(objeto);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), objeto);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}

	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	public Object getObjetoPorPosicao(int posicao) {
		return this.pegaCelula(posicao).getObjeto();
	}

	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}

	public boolean contemNaFila(Object objeto) {
		Celula atual = this.primeira;

		while (atual != null) {
			if (atual.getObjeto().equals(objeto)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}

	public int getTamanho() {
		return this.totalDeElementos;
	}

	/*
	 * Lista Ligada especialmente porque queremos um tipo de Lista que as
	 * operações de adicionar e remover da primeira e da última posição sejam
	 * computacionalmente eficientes. Então, vamos acrescentar mais três métodos
	 * na classe ListaLigada. adicionaNoComeco() removeDoComeco() removeDoFim()
	 */

	public void adicionaNoComeco(Object objeto) {
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(objeto);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, objeto);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoValida(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}

	}

	public void removeDoFim() {
		if (!this.posicaoValida(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	@Override
	public String toString() {
		// Verificando se a Lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getObjeto());
			builder.append(", ");
			atual = atual.getProxima();
		}
		// último elemento
		builder.append(atual.getObjeto());
		builder.append("]");
		return builder.toString();
	}
}
