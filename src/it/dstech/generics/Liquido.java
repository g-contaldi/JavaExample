package it.dstech.generics;

public abstract class Liquido {

	private String contenuto;

	public Liquido(String contenuto) {
		this.contenuto = contenuto;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

}
