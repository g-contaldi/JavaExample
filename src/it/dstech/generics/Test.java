package it.dstech.generics;

public class Test {

	public static void main(String[] args) {

		Bottiglia<Liquido> acqua = new Bottiglia<Liquido>(new Acqua("acqua"));
		Bottiglia<Vino> vino = new Bottiglia<Vino>(new Vino("vino"));

		prendiBottiglia(acqua);
		prendiBottiglia(vino);

	}

	public static <T> void prendiBottiglia(Bottiglia<T> bottiglia) {

		System.out.println("ho preso una bottiglia di: " + bottiglia.getTipo());

	}

}
