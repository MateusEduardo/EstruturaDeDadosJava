package br.com.e.mapas;

public class AssociacaoGeneralizadaParametrizada<C, V> {
	private C chave;
	private V valor;

	public AssociacaoGeneralizadaParametrizada(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public C getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "{" + this.chave + " -> " + this.valor + "}";
	}
}
