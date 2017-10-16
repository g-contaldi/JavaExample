package it.dstech.generics;

public class Vino extends Liquido {

	public Vino(String contenuto) {
		super(contenuto);
	}

	@Override
	public String toString() {
		return getContenuto();
	}

}
