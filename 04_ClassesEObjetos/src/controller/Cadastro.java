package controller;

import model.Carro;
import model.Livro;
import model.Funcionario;
import model.Produto;

public class Cadastro {
	public static void main(String[] args) {

		Carro car = new Carro();
		car.fabricante = "Volkswagen";
		car.modelo = "Gol";
		car.cor = "Vermelho";
		car.ano = 1990;

		Carro car1 = new Carro();
		car1.fabricante = "Ford";
		car1.modelo = "Mustang";
		car1.cor = "Branco";
		car1.ano = 2018;

		Carro car2 = new Carro();
		car2.fabricante = "Hyundai";
		car2.modelo = "HB20";
		car2.cor = "Prata";
		car2.ano = 2017;

		Funcionario fun = new Funcionario();
		fun.Matricula = 0121323;
		fun.nome = "José Alencar";
		fun.cpf = "132.543.453-43";

		Funcionario fun1 = new Funcionario();
		fun1.Matricula = 5943893;
		fun1.nome = "Fabricio Curvelo";
		fun1.cpf = "534.323.543-53";

		Funcionario fun2 = new Funcionario();
		fun2.Matricula = 8675645;
		fun2.nome = "Andre Souza";
		fun2.cpf = "100.500.400-00";

		Livro liv = new Livro();
		liv.isbn = 123;
		liv.nome = "O amanhã";
		liv.autor = "Machado de Assis";
		liv.editora = "Abril";

		Livro liv1 = new Livro();
		liv1.isbn = 463;
		liv1.nome = "A noite";
		liv1.autor = "Thiago Silva";
		liv1.editora = "Ética";

		Livro liv2 = new Livro();
		liv2.isbn = 532;
		liv2.nome = "A tarde";
		liv2.autor = "Santiago e Santiago";
		liv2.editora = "Saraiva";

		Produto prod = new Produto();
		prod.idProduto = 10;
		prod.nomenclatura = "Limpeza";
		prod.descricao = "Sabão em Pó";
		prod.quantidade = 5;

		Produto prod1 = new Produto();
		prod1.idProduto = 12;
		prod1.nomenclatura = "Alimenticio";
		prod1.descricao = "Biscoito Trakinas";
		prod1.quantidade = 8;

		Produto prod2 = new Produto();
		prod2.idProduto = 03;
		prod2.nomenclatura = "Higiene";
		prod2.descricao = "Papel Higienico";
		prod2.quantidade = 19;

		System.out.println(prod.idProduto);
	}

}
