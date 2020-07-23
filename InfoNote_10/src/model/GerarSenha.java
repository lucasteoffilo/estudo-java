package model;

public class GerarSenha {

	public static String gerarSenha() {
		String senha = "";

		for (int i = 0; i < 8; i++) {
			senha += gerarCaracter(i);

		}

		return senha;

	}

	public static char gerarCaracter(int i) {

		char caracter = 0;

		switch (i % 4) {

		case 0:
			// Intervalo de Letras Maiusculas na Tabela ASCII
			caracter = gerarAleatorio(65, 90);
			break;
		case 1:
			// Intervalo de letras minusculas na Tabela ASCII
			caracter = gerarAleatorio(97, 122);
			break;

		case 2:
			// Intervalo de numeros da Tabela ASCII
			caracter = gerarAleatorio(48, 57);
			break;
		case 3:
			// Intervalo de caracteres especiais na tabela ASCII
			caracter = gerarAleatorio(33, 47);
		}
		return caracter;

	}

	public static char gerarAleatorio(int inicio, int fim) {

		return (char) (Math.random() * (fim - inicio + 1) + inicio);

	}

}
