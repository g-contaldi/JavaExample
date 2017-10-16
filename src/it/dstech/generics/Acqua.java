package it.dstech.generics;

public class Acqua extends Liquido {

	public Acqua(String contenuto) {
		super(contenuto);
	}

	@Override
	public String toString() {
		return getContenuto();
	}

}
