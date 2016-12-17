package br.com.e.vetor;

public class Vetor {

	Object[] objetos = new Object[20];
	private int totalDeObjetos = 0;

	public void printa(Object pao_de_queijo) {
		System.out.println(pao_de_queijo);
	}

	/*
	 * Se o total de objetos bater com o tamanho do array, a função dobra o
	 * tamanho do array em um novo array, envia os dados do array antigo para o
	 * novo array(agora o dobro do tamanho), e finalmente substitui o array
	 * antigo pelo novo array.
	 */
	private void arrumaEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novo = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novo[i] = this.objetos[i];
			}
			this.objetos = novo;
		}

	}

	// adiciona um objeto no final da fila
	public void adiciona(Object objeto) {
		this.arrumaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}

	// adiciona o objeto na posição passada
	public void adiciona(int posicao, Object objeto) {
		this.arrumaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		/*
		 * inicia pelo final do total de objetos e enquanto for maior que a
		 * posição que foi passada, move os objetos pra direita abrindo um
		 * espaço para inserir o novo objeto na posição passada
		 */
		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}

		// insere o objeto no espaço aberto dentro do for
		this.objetos[posicao] = objeto;

		this.totalDeObjetos++;

	}

	public Object getObjetoPorPosicao(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao + 1; i < this.totalDeObjetos; i++) {
			this.objetos[i - 1] = this.objetos[i];
		}
		this.totalDeObjetos--;
	}

	public boolean contemNaFila(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (objeto == this.objetos[i]) {
				return true;
			}
		}
		return false;
	}

	public int getTamanho() {
		return this.totalDeObjetos;
	}

	@Override
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		return builder.toString();
	}
}