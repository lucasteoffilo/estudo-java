package model;

public class Cantor {

	int CodCantor;
	String NomeCantor;

	public Cantor() {

	}

	public Cantor(int CodCantor, String nomeCantor) {
		super();
		this.CodCantor = CodCantor;
		NomeCantor = nomeCantor;
	}

	public String getNomeCantor() {
		return NomeCantor;
	}

	public void setNomeCantor(String nomeCantor) {
		NomeCantor = nomeCantor;
	}

	public int getCodCantor() {
		return CodCantor;
	}

	public void setCodCantor(int codCantor) {
		CodCantor = codCantor;
	}

	public void mostrar() {

		System.out.println("\n\nNome do Cantor: " + NomeCantor);
	}
}
