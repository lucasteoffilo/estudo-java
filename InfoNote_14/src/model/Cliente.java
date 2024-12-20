package model;

import java.util.ArrayList;
import java.util.List;

import model.DAO.ClienteDAO;

public class Cliente extends Usuario implements IUsuario {

	private String codigoCliente;
	private String nome;
	private String email;
	private String telefone;
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente() {
		super();
	}

	public Cliente(String login, String senha, int tipo, String codigoCliente, String nome, String email,
			String telefone, Endereco endereco) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		inserirEndereco(endereco); // insere na posi��o zero do vetor o endere�o residencial

	}

	public Cliente(String login, String senha, int tipo, String codigoCliente, String nome, String email,
			String telefone) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;

	}

	public boolean inserirPedido(Pedido pedido) {
		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i) == null) {
				pedidos.add(pedido);
				return true;
			}
		}
		return false;
	}

	public boolean inserirEndereco(Endereco end) {
		for (int i = 0; i < enderecos.size(); i++) {
			if (enderecos.get(i) == null) {
				enderecos.add(end);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		retValue = "Informa��es sobre o cliente" + ENTER + super.toString() + "C�digo do Cliente: " + codigoCliente
				+ ENTER + "Nome: " + nome + ENTER + "E-mail: " + email + ENTER + "Telefone: " + telefone + ENTER;

		return retValue;
	}

	@Override
	public boolean validarLogin(String login, String senha) {

		Cliente cliente = ClienteDAO.buscarPorLoginSenha(login, senha);
		if (cliente != null) {
			return true;
		}
		return false;
	}

	public String getNomeInvertido() {

		String nome, sobrenome;

		int posicao = getNome().indexOf(" ");
		nome = getNome().substring(0, posicao);

		posicao = getNome().lastIndexOf(" ");
		sobrenome = getNome().substring(posicao + 1);

		return sobrenome + ", " + nome;

	}

}
