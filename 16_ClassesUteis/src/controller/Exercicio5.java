package controller;

import java.text.NumberFormat;

import util.Teclado;

public class Exercicio5 {

	public static void main(String[] args) {

		double salario = Teclado.lerDouble("Salário: ");

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println(nf.format(salario));

	}

}
