package model;

public class Notebook {

	public int numeroNote;
	public String model;
	public String descricao;
	public int estoque;
	public double precoUnitario;
	public String figura;
	public String dataCadastro;

	public Notebook(int numeroNote, String model, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {

		this.numeroNote = numeroNote;
		this.model = model;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;

	}

	public void mostrar() {

		System.out.println("Notebook");
		System.out.println("Número Notebook: " + this.numeroNote);
		System.out.println("Modelo: " + this.model);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Preço Unitario: " + this.precoUnitario);
		System.out.println("Figura: " + this.figura);
		System.out.println("Data Cadastro: " + this.dataCadastro);

	}
}
