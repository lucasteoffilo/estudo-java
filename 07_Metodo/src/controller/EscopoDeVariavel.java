package controller;

public class EscopoDeVariavel {

	static int x = 1;

	public static void main(String[] args) {

		int x = 5;
		System.out.println("x no in�cio de main() � " + x);

		metodoA();

		metodoB(x);
	}

	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("Variavel local x antes de sair do metodoA � " + x);
	}

	public static void metodoB(int x) {
		System.out.println("Variavel x ao entrar no metodoB � " + x + " global.");
		x = x * 10;
		System.out.println("Variavel x ao sair do metodoB � " + x);
	}
}
