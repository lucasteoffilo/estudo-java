package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		
		try {

			double a = Teclado.lerDouble("Digite o Numerador: ");
			double b = Teclado.lerDouble("Digite o Denominador: ");

			double c = a / b;

			System.out.println("Resultado da vis�o de a por b" + c);

		} catch (NumberFormatException e) {

			System.out.println("Caracter inv�lido!");

			main(args);

		} catch (ArithmeticException ae) {

			System.out.println("Divis�o por zero");
		}

	}

}
