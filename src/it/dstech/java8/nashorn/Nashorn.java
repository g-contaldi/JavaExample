package it.dstech.java8.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import it.dstech.serialize.Persona;

public class Nashorn {

	static ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

	public static void main(String[] args) {

		hello();

		callJsFile();
	}

	private static void callJsFile() {

		try {
			engine.eval(new FileReader("script.js"));

			Invocable invocable = (Invocable) engine;

			Object result = invocable.invokeFunction("fun1", "Peter Parker");
			System.out.println(result);
			System.out.println(result.getClass());

			invocable.invokeFunction("fun2", new Date());

			invocable.invokeFunction("fun2", LocalDateTime.now());

			invocable.invokeFunction("fun2", new Persona("Pino", "Daniele"));

		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

	private static void hello() {

		try {
			engine.eval("print('Hello World!');");
			engine.eval("alert('hai sbagliato');");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
