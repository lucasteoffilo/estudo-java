package controller;

public class Exercicio4 {

	static int[] res = new int[2];
	static double sort;

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			sort = Math.random();
			res[i] = (int) (sort * 99);
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("N�mero " + i + 1 + ": " + res[i]);
		}
		System.out.println("Maior n�mero: " + Math.max(res[0], res[1]));

	}
}
