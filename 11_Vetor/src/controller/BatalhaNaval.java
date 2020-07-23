package controller;

import util.Teclado;

public class BatalhaNaval {

	public static void main(String[] args) {

		String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "Água";
			}
		}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Aviões";
		arena[0][2] = "Navio";

		int linha, coluna;

		for (int cont = 1; cont <= 5; cont++) { // 5 tiros

			System.out.println("\n ************** TIRO NÚMERO " + cont + " *************");

			do {// forçando o valor certo na linha
				linha = Teclado.lerInt("Digite a coordenada da linha (ENTRE 0 e 3): ");
			} while ((linha < 0) || (linha > 3));

			do {// forçando o valor certo na coluna
				coluna = Teclado.lerInt("Digite a coordenada da coluna (ENTRE 0 e 4):");
			} while ((coluna < 0) || (coluna > 4));

			System.out.println("Você acertou: " + arena[linha][coluna]);

		}

	}
}