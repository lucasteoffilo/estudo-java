package model;

public class Notebook {

	private String numeroNote;
	private String model;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;

	public Notebook() {
		super();
	}

	public Notebook(String numeroNote, String model, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		this.numeroNote = numeroNote;
		this.model = model;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	public String getNumeroNote() {
		return numeroNote;
	}

	public void setNumeroNote(String numeroNote) {
		this.numeroNote = numeroNote;
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

	public void mostrar() {

		System.out.println("\nNotebook \n");
		System.out.println("Número Notebook: " + this.numeroNote);
		System.out.println("Modelo: " + this.model);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Preço Unitario: " + this.precoUnitario);
		System.out.println("Figura: " + this.figura);
		System.out.println("Data Cadastro: " + this.dataCadastro);

	}
}
