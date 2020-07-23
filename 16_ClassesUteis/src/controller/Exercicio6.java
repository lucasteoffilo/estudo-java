package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio6 {

	public static void main(String[] args) {

		double num = 123456.789;

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		System.out.println(nf1.format(num));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nf2.format(num));

		Locale local = new Locale("pt", "BR");
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(local);
		System.out.println(nf3.format(num));

	}

}
