package it.dstech.generics;

public class Bottiglia<T> {

	private T tipo;

	public Bottiglia(T tipo) {
		this.tipo = tipo;
	}

	public T getTipo() {
		return tipo;
	}

	public void setTipo(T tipo) {
		this.tipo = tipo;
	}

}
