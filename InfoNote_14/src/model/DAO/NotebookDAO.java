package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Notebook;
import util.Conexao;

public class NotebookDAO {

	String url;
	String driver;
	String login;
	String senha;

	public static Notebook inserir(String serialNote, String model, String descricao, int estoque, double precoUnitario,
			String figura, String dataCadastro) {

		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();

		try {

			// Cria��o do insert
			String sql = "insert into notebook (serialNote, model, descricao, estoque, precoUnitario, figura, dataCadastro) values (?, ?, ?, ?, ?, ?, ?)";

			// Obter a conexao com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			// Abrir conexao
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);
			comando.setString(2, model);
			comando.setString(3, descricao);
			comando.setInt(4, estoque);
			comando.setDouble(5, precoUnitario);
			comando.setString(6, figura);
			comando.setString(7, dataCadastro);

			// n�o � fklogin, porque aqui a referencia � da classe

			// Comando executado

			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		notebook = new Notebook(serialNote, model, descricao, estoque, precoUnitario, figura, dataCadastro);

		return notebook;

	}

	public static List<Notebook> buscarTodos() {

		List<Notebook> notebook = new ArrayList<Notebook>();

		NotebookDAO noteDAO = new NotebookDAO();

		try {

			String sql = "Select * from notebook";

			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			Connection con = conex.obterConexao();

			PreparedStatement comando = con.prepareStatement(sql);

			ResultSet rs = comando.executeQuery();

			while (rs.next()) {
				notebook.add(new Notebook(rs.getString("serialNote"), rs.getString("model"),
						rs.getString("descricao"), rs.getInt("estoque"), rs.getDouble("precoUnitario"),
						rs.getString("figura"), rs.getString("dataCadastro")));
			}

			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return notebook;
	}

	public static Notebook excluir(String serialNote) {

		Notebook notebook = null;

		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Cria��o do delete
			String sql = "delete from notebook where serialNote = ?)";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, serialNote);

			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return notebook;

	}

	public static Notebook atualizar(String serialNote, String descricao, int estoque,
			double precoUnitario, String figura, String dataCadastro) {

		Notebook notebook = null;

		NotebookDAO noteDAO = new NotebookDAO();

		try {
			// Cria��o do update
			String sql = "update notebook set descricao, estoque, precoUnitario, figura, dataCadastro values (?, ?, ?, ?, ?) where serialNote = ?";

			// Obter a conex�o com o banco de dados
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

			// Abrir a conex�o
			Connection con = conex.obterConexao();

			// Preparar o comando para ser executado

			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, descricao);
			comando.setInt(2, estoque);
			comando.setDouble(3, precoUnitario);
			comando.setString(4, figura);
			comando.setString(5, dataCadastro);
			comando.setString(6, serialNote);

			// Comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return notebook;

	}
	
	public static Notebook buscarPorModelo (String model) {
		Notebook notebook = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
			// Cria��o do update
						String sql = "select * from notebook where modelo = ?";

						// Obter a conex�o com o banco de dados
						Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);

						// Abrir a conex�o
						Connection con = conex.obterConexao();

						// Preparar o comando para ser executado

						PreparedStatement comando = con.prepareStatement(sql);

						comando.setString(1, model);			

						// Comando executado
						ResultSet rs = comando.executeQuery();
						
						if (rs.next()) {
							notebook = new Notebook(rs.getString("serialNote"),
									rs.getString("modelo"), rs.getString("descricao"),
									rs.getInt("estoque"),rs.getDouble("precounitario"),
									rs.getString("figura"),rs.getString("datacadastro"));
						}
						
						rs.close();
						comando.close();
						con.close();

					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					return notebook;

		}
	}


