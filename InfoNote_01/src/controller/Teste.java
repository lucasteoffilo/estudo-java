package controller;

import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;

public class Teste {

	public static void main(String[] args) {

		Usuario user = new Usuario();

		user.Matricula = 12345678;
		user.login = "Amanda10";
		user.senha = "01010101";
		user.nome = "Amanda Silva";
		user.email = "amandasilva@gmail.com";
		user.telefone = "(21)99453-4323";

		Endereco end = new Endereco();

		end.logradouro = "Rua Beline";
		end.numero = "12";
		end.complemento = "Prox. ao Ponto Frio";
		end.bairro = "Irajá";
		end.cidade = "Rio de Janeiro";
		end.estado = "RJ";
		end.cep = "21230-085";

		Notebook note1 = new Notebook();

		note1.numeroNote = 1203;
		note1.model = "Acer - Aspire";
		note1.descricao = "Core i3 - 6GB DDR3";
		note1.estoque = 10;
		note1.precoUnitario = 1999.99;
		note1.figura = "caminho da figura";
		note1.dataCadastro = "10/01/2018";

		Notebook note2 = new Notebook();

		note2.numeroNote = 0323;
		note2.model = "Acer - Aspire One";
		note2.descricao = "Core i7 - 8GB DDR4";
		note2.estoque = 5;
		note2.precoUnitario = 3900.99;
		note2.figura = "caminho da figura";
		note2.dataCadastro = "15/02/2018";

		Notebook note3 = new Notebook();

		note3.numeroNote = 300;
		note3.model = "Lenovo ThinkPad";
		note3.descricao = "Core i9 - 16GB DDR4";
		note3.estoque = 2;
		note3.precoUnitario = 9999.99;
		note3.figura = "caminho da figura";
		note3.dataCadastro = "10/04/2018";

		Pedido ped = new Pedido();

		ped.numero = 11;
		ped.dataEmissao = "22-03-2018";
		ped.formaDePagamento = "Cartão Crédito";
		ped.valorTotal = 2000;
		ped.situacao = "Pago";

		ItemDePedido it1 = new ItemDePedido();

		it1.qtde = 2;
		it1.subtotal = 4000;

		ItemDePedido it2 = new ItemDePedido();
		it2.qtde = 1;
		it2.subtotal = 9999.99;

		System.out.println("Matricula: " + user.Matricula);
		System.out.println("Login: " + user.login);
		System.out.println("Senha: " + user.senha);
		System.out.println("Nome: " + user.nome);
		System.out.println("Email: " + user.email);
		System.out.println("Telefone" + user.telefone);

		System.out.println();
		System.out.println("Logradouro: " + end.logradouro);
		System.out.println("Número: " + end.numero);
		System.out.println("Complemento: " + end.complemento);
		System.out.println("Bairro: " + end.bairro);
		System.out.println("Cidade: " + end.cidade);
		System.out.println("Estado: " + end.estado);
		System.out.println("CEP: " + end.cep);

		System.out.println();
		System.out.println("Número Notebook: " + note1.numeroNote);
		System.out.println("Modelo: " + note1.model);
		System.out.println("Descrição: " + note1.descricao);
		System.out.println("Estoque: " + note1.estoque);
		System.out.println("Preço Unitario: " + note1.precoUnitario);
		System.out.println("Figura: " + note1.figura);
		System.out.println("Data Cadastro: " + note1.dataCadastro);

		System.out.println();
		System.out.println("Número Notebook: " + note2.numeroNote);
		System.out.println("Modelo: " + note2.model);
		System.out.println("Descrição: " + note2.descricao);
		System.out.println("Estoque: " + note2.estoque);
		System.out.println("Preço Unitario: " + note2.precoUnitario);
		System.out.println("Figura: " + note2.figura);
		System.out.println("Data Cadastro: " + note2.dataCadastro);

		System.out.println();
		System.out.println("Número Notebook: " + note3.numeroNote);
		System.out.println("Modelo: " + note3.model);
		System.out.println("Descrição: " + note3.descricao);
		System.out.println("Estoque: " + note3.estoque);
		System.out.println("Preço Unitario: " + note3.precoUnitario);
		System.out.println("Figura: " + note3.figura);
		System.out.println("Data Cadastro: " + note3.dataCadastro);

		System.out.println();
		System.out.println("Nº Pedido: " + ped.numero);
		System.out.println("Data de Emissão: " + ped.dataEmissao);
		System.out.println("Forma de Pagamento: " + ped.formaDePagamento);
		System.out.println("Valor Total R$: " + ped.valorTotal);
		System.out.println("Situação: " + ped.situacao);

		System.out.println();
		System.out.println("Quantidade: " + it1.qtde);
		System.out.println("Subtotal: " + it1.subtotal);

		System.out.println();
		System.out.println("Quantidade: " + it2.qtde);
		System.out.println("Subtotal: " + it2.subtotal);

	}
}
