package controller;

public class Exercicio3 {

	static int[] res = new int[10];
	static double sort;

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			sort = Math.random();
			res[i] = (int) (sort * 80);
		}
		int j = 1;
		for (int i = 0; i < 10; i++) {

			System.out.println("Número '" + j + "' : " + res[i] + "\n");
			j++;
		}

	}

}
