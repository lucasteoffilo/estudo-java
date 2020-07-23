package controller;

import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;

public class Teste {

	public static void main(String[] args) {

		Usuario user = new Usuario();

		user.setNome("Ana Clara");
		user.setLogin("AnaC");
		user.setSenha("12345");
		user.setEmail("anaclara@email.com");
		user.setMatricula(1003421);
		user.setTelefone("21 93333-4444");

		user.mostrar();

		Endereco end = new Endereco();

		end.setLogradouro("Rua Souza");
		end.setNumero("10");
		end.setComplemento("Prox. ao Mercado");
		end.setBairro("Bonsucesso");
		end.setCidade("Rio de Janeiro");
		end.setEstado("RJ");
		end.setCep("22333-000");

		end.mostrar();

		Notebook note = new Notebook();

		note.setNumeroNote(232);
		note.setModel("Asus RogStrix");
		note.setDescricao("Core i7, 16GB DDR4");
		note.setEstoque(10);
		note.setPrecoUnitario(5800.50);
		note.setFigura("C:\\imagem.jpg");
		note.setDataCadastro("01-05-2018");

		note.mostrar();

		ItemDePedido item = new ItemDePedido();

		item.setQtde(2);
		item.setSubtotal(note.getPrecoUnitario() * item.getQtde());

		item.mostrar();

		ItemDePedido item2 = new ItemDePedido();

		item2.setQtde(3);
		item2.setSubtotal(note.getPrecoUnitario() * item2.getQtde());

		item2.mostrar();

		Pedido ped = new Pedido();

		ped.setNumero(30012);
		ped.setDataEmissao("01-05-2018");
		ped.setFormaDePagamento("Cartão de Crédito");
		ped.setValorTotal(item.getSubtotal() + item2.getSubtotal());
		ped.setSituacao("Aprovado");

		ped.mostrar();

	}
}
