package model;

import java.text.DecimalFormat;

public class Pedido {

	public String numeroPedido;
	public String dataEmissao;
	public String formaDePagamento;
	public double valorTotal;
	public String situacao;
	@SuppressWarnings("unused")
	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public ItemDePedido[] getItens() {
		return itens;
	}

	public String getNumero() {
		return numeroPedido;
	}

	public void setNumero(String numero) {
		this.numeroPedido = numero;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Pedido() {
		super();
	}

	public Pedido(String numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao,
			Endereco enderecoEntrega) {
		this.numeroPedido = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {

		final String ENTER = "\n";
		String retValue = "";

		DecimalFormat real = new DecimalFormat("R$ ###,###.00");

		retValue = "Informações sobre Pedido:" + ENTER + "Número do Pedido: " + numeroPedido + ENTER
				+ "Data de Emissão: " + dataEmissao + ENTER + "Forma de Pagamento: " + formaDePagamento + ENTER
				+ "Valor Total: " + real.format(valorTotal) + ENTER + "Situação: " + situacao + ENTER
				+ "Endereço de Entrega: " + enderecoEntrega + ENTER + "Itens: ";

		for (int i = 0; i < itens.length; i++) {
			retValue += itens[i] + ENTER;
		}
		return retValue;
	}
}
