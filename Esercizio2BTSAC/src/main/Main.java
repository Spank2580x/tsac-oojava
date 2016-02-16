package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		PressureSensor ps = new PressureSensor();
		for (int i = 0; i < 1000; i++) {
			ps.next();// nel next non entra nella generazione...
			System.out.println("chiamata " + i);
		}

	}
}
