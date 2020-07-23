
package controller;

import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;

public class Teste {

	public static void main(String[] args) {

		Usuario user = new Usuario(1, "Amanda10", "01010101", "Amanda Silva", "amandasilva@email.com",
				"(21)99453-4323");

		user.mostrar();

		Endereco end = new Endereco("Rua Beline", "12", "Prox. ao Ponto Frio", "Irajá", "Rio de Janeiro", "RJ",
				"21230-085");
		end.mostrar();

		Notebook note = new Notebook(1203, "Acer - Aspire", "Core i3 - 6GB DDR3", 10, 1999.99, "caminho da figura",
				"10/01/2018");
		
		note.mostrar();
		
		ItemDePedido item = new ItemDePedido(1,(note.precoUnitario * 1));

		item.mostrar();

		Pedido ped = new Pedido(11, "22-03-2018", "Cartão Crédito", item.subtotal, "Pago");

		ped.mostrar();

	}
}
