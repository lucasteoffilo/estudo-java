package model;

public class Pedido {

	public int numero;
	public String dataEmissao;
	public String formaDePagamento;
	public double valorTotal;
	public String situacao;

	public Pedido(int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao) {

		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;

	}

	public void mostrar() {

		System.out.println("\nPedido: \n");
		System.out.println("Nº Pedido: " + this.numero);
		System.out.println("Data de Emissão: " + this.dataEmissao);
		System.out.println("Forma de Pagamento: " + this.formaDePagamento);
		System.out.println("Valor Total R$: " + this.valorTotal);
		System.out.println("Situação: " + this.situacao);

	}
}
