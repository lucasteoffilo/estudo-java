package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComTratamentoDeErroGeneralizado {

	public static void main(String[] args) throws IOException {

		int val1 = obtemNumero("Primeiro");
		int val2 = obtemNumero("Segundo");
		System.out.println("N�meros lidos: " + val1 + " e " + val2);

	}

	static int obtemNumero(String n) throws IOException {
		System.out.println("Digite o " + n + " numero: ");
		return lerNumero();
	}

	static int lerNumero() throws IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(teclado.readLine());
		return x;
	}

}
