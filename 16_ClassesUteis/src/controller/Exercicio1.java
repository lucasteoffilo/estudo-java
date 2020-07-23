package controller;

import util.Teclado;

public class Exercicio1 {

	public static void main(String[] args) {

		String frase = Teclado.lerTexto("Digite uma frase que seja importante em sua vida.");
		String p1 = frase.substring(0, frase.indexOf(" "));

		System.out.println("A primeira palavra\n" + p1);
		System.out.println(frase.toUpperCase());
		System.out.println(p1.toLowerCase());
		System.out.println(frase.substring(10,18));
		System.out.println(frase.substring(25));

	}

}
