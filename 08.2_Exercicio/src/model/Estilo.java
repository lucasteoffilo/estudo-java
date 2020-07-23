package model;

public class Estilo {

	private int CodEstilo;
	private String nomeEstilo;

	public Estilo() {

	}

	public Estilo(int CodEstilo, String nome) {
		this.nomeEstilo = nome;
		this.CodEstilo = CodEstilo;
	}

	public String getNome() {
		return nomeEstilo;
	}

	public void setNome(String nome) {
		this.nomeEstilo = nome;
	}

	public int getCodEstilo() {
		return CodEstilo;
	}

	public void setCodEstilo(int codEstilo) {
		CodEstilo = codEstilo;
	}

	public void mostrar() {

		System.out.println("Estilo: " + this.nomeEstilo);
	}

}
