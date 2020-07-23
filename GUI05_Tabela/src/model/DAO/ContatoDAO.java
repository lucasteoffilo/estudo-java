package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Contato;
import util.Conexao;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {

		Contato contato = null;

		try {
			// Criação do insert
			String sql = "insert into contato (nome, email, mensagem) values (?,?,?)";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true",
					"com.mysql.cj.jdbc.Driver", "root", "mysql");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		contato = new Contato(nome, email, mensagem);
		return contato;

	}

	public static List<Contato> buscarTodos() {
		List<Contato> contatos = new LinkedList<Contato>();

		try {
			// Criação do select
			String sql = "Select * from contato";

			// Obter a conexao com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true",
					"com.mysql.cj.jdbc.Driver", "root", "mysql");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			Statement comando = con.createStatement();

			ResultSet rs = comando.executeQuery(sql);

			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setMensagem(rs.getString("mensagem"));
				contatos.add(c);
			}

			rs.close();
			comando.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contatos;
	}

	public static Contato excluir(int id) {

		Contato contato = null;

		try {
			// Criação do delete
			String sql = "delete from contato where id = ?)";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true",
					"com.mysql.cj.jdbc.Driver", "root", "mysql");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, id);

			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return contato;

	}

	public static Contato atualizar(String mensagem, int id) {

		Contato contato = null;

		try {
			// Criação do update
			String sql = "update contato set mensagem = ? where id = ?";

			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true",
					"com.mysql.cj.jdbc.Driver", "root", "mysql");

			// Abrir a conexão
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, mensagem);
			comando.setInt(2, id);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return contato;

	}

}
