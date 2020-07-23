package model;

public class Musica {

	private int CodMusica;
	private String NomeMusica;
	private int AnoGravacao;
	private String NomeVersao;

	public Musica() {

	}

	public Musica(int CodMusica, String nomeMusica, int anoGravacao, String nomeVersao) {
		super();

		this.CodMusica = CodMusica;
		NomeMusica = nomeMusica;
		AnoGravacao = anoGravacao;
		NomeVersao = nomeVersao;
	}

	public String getNomeMusica() {
		return NomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		NomeMusica = nomeMusica;
	}

	public int getAnoGravacao() {
		return AnoGravacao;
	}

	public void setAnoGravacao(int anoGravacao) {
		AnoGravacao = anoGravacao;
	}

	public String getNomeVersao() {
		return NomeVersao;
	}

	public void setNomeVersao(String nomeVersao) {
		NomeVersao = nomeVersao;
	}

	public int getCodMusica() {
		return CodMusica;
	}

	public void setCodMusica(int codMusica) {
		CodMusica = codMusica;
	}

	public void mostrar() {

		System.out.println("Música: " + this.NomeMusica);
		System.out.println("Ano de Gravação: " + this.AnoGravacao);
		System.out.println("Versão: " + this.NomeVersao + "\n");
	}

}
