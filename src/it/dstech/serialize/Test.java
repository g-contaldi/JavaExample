package it.dstech.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		try {
			serialize();

			deserialize();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void serialize() throws IOException, FileNotFoundException {
		Persona persona = new Persona("pino", "lavatrice");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialize.txt"));
		oos.writeObject(persona);
		oos.flush();
		oos.close();
	}

	private static void deserialize() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialize.txt"));
		Persona readObject = (Persona) ois.readObject();
		System.out.println(readObject);
		ois.close();
	}

}
