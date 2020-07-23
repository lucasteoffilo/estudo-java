package model;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno() {
		super();
	}

	public Aluno(String nome, String rg, String cpf, String telefone, String email, String matricula, String curso) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String toString() {

		String retorno = "- ALUNO - \nMatrícula: " + this.matricula + " \nNome: " + super.getNome() + " \nE-mail: "
				+ super.getEmail();

		return retorno;
	}

}
