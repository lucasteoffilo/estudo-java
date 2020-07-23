package controller;

public class DesafioMegaSena {

	public static void main(String[] args) {

		int numeroSorteado;
		int historico[] = new int[6];

		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			numeroSorteado = (int) (numeroSena * 61);

			for (int j = 0; j < 6; j++) {
				if (numeroSorteado != historico[j]) {
					historico[i] = numeroSorteado;

				}

			}
			System.out.println("Numero Sorteado: " + historico[i]);

		}

	}

}
