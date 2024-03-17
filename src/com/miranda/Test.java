package com.miranda;

import java.util.Iterator;

public class Test {

	

	public static void main(String[] args) {
		fibonacci(7);
	}

	private static void fibonacci(int n) {
		
		int aux = 1;
		int inicio = 0;
		int suma;
		for (int i = 0; i < n; i++) {
			System.out.println(inicio);
			suma = inicio+aux;
			inicio = aux;
			aux=suma;
			
			
		}
		
		
	}
}
