package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ajuda {

	private String texto;

	@SuppressWarnings("resource")
	public Ajuda(String nomeArquivo) throws Exception {

		// Abre o arquivo
		BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));

		// Variável para armazenar as linhas de texto do arquivo

		String linha = "";

		do {
			// Faz a leitura da linha do arquivo
			linha = in.readLine();

			// Caso nao tenha terminado as linhas vai armazenando
			if (linha != null) {
				texto += linha + "\n";
			}
		} while (linha != null);

	}

	public String getTexto() {

		return texto;
	}
}
