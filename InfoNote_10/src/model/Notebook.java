package model;

import java.text.DecimalFormat;

public class Notebook {

	private String serialNote;
	private String model;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;

	public String getNumeroNote() {
		return serialNote;
	}

	public void setNumeroNote(String numeroNote) {
		this.serialNote = numeroNote;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Notebook() {
		super();
	}

	public Notebook(String serialNote, String model, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		this.serialNote = serialNote;
		this.model = model;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		DecimalFormat real = new DecimalFormat("R$ ###,###.00");

		retValue = "Notebook" + ENTER + super.toString() + "Serial Notebook: " + serialNote + ENTER + "Modelo: " + model
				+ ENTER + "Descrição: " + descricao + ENTER + "Estoque: " + estoque + ENTER + "Preço Unitario: "
				+ real.format(precoUnitario) + ENTER + "Figura: " + figura + ENTER + "Data Cadastro: " + dataCadastro;

		return retValue;
	}

}
