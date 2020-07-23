package model;

public class Usuario {

	public int Matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	public Usuario(int Matricula, String login, String senha, String nome, String email, String telefone) {
		super();
		this.Matricula = Matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void mostrar() {

		System.out.println("\n\nUsuário: \n");
		System.out.println("Matrícula: " + this.Matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}
}
