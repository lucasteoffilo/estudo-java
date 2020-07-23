package controller;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		String nome;

		System.out.print("Digite seu nome: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		nome = sc.next();

		System.out.println("Nome Digitado: " + nome);

		double salario;

		System.out.println("Digite o salário que deseja: ");
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();

		System.out.println("Salário Pretendido: " + salario);
	}

}
