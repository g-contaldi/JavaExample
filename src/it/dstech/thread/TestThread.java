package it.dstech.thread;

public class TestThread {

	public static void main(String args[]) {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();

		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
		
		System.out.println("fuori dal thread");
	}

}