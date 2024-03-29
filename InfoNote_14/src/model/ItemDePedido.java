package model;

import java.text.DecimalFormat;

public class ItemDePedido {

	private int qtde;
	private double subtotal;

	private Notebook notebook;

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		this.qtde = qtde;
		this.subtotal = subtotal;
	}

	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}

	public void mostrar() {

		System.out.println("\nItens \n");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}

	@Override
	public String toString() {

		DecimalFormat real = new DecimalFormat("R$ ###,###.00");

		return "Itens\n" + "Modelo: " + notebook.getModel() + "\nQuantidade: " + real.format(qtde) + ",\n Subtotal: " + real.format(subtotal)
				+ ",\n Notebook: " + notebook;
	}
}
