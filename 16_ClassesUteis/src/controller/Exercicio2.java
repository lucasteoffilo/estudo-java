package controller;

import util.Teclado;

public class Exercicio2 {

	public static void main(String[] args) {

		double a = Teclado.lerDouble("Informe o ângulo: ");

		System.out.println("Seno: " + Math.sin(a));
		System.out.println("Cosseno: " + Math.cos(a));
		System.out.println("Tangente: " + Math.tan(a));

	}

}
