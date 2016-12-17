package br.com.e.bean;

public class Celula {
	private Celula proxima;
	private Celula anterior;
	private Object objeto;

	public Celula(Celula proxima, Object objeto) {
		this.proxima = proxima;
		this.objeto = objeto;
	}

	public Celula(Object objeto) {
		this.objeto = objeto;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public Object getObjeto() {
		return objeto;
	}
}