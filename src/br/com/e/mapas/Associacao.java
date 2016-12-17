package br.com.e.mapas;

import br.com.e.bean.Carro;

public class Associacao {

	private String placa;
	private Carro carro;

	public Associacao(String placa, Carro carro) {
		this.placa = placa;
		this.carro = carro;
	}

	public String getPlaca() {
		return placa;
	}

	public Carro getCarro() {
		return carro;
	}
}
