package controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.GerarSenha;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;
import model.DAO.ClienteDAO;
import model.DAO.EnderecoDAO;
import model.DAO.FuncionarioDAO;
import model.DAO.NotebookDAO;
import model.DAO.UsuarioDAO;
import util.Ajuda;
import util.Configurador;
import util.Teclado;

public class InfoNote {

	Cliente cliente = new Cliente();

	Usuario usuario;

	List<Notebook> notebooks = new ArrayList<Notebook>();

	Pedido pedido;

	boolean logado = false;

	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;

	Configurador config;
	Ajuda ajuda;

	DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT);
	Calendar calendario = new GregorianCalendar();
	String data = formatoData.format(calendario.getTime());

	String hora = (DateFormat.getTimeInstance().format(new Date()));

	public static void main(String[] args) {

		InfoNote info = new InfoNote();

		int opcao = SAIR;
		try {
			do {
				info.mostrarMenu();

				opcao = Teclado.lerInt("Digite sua opção: ");

				switch (opcao) {

				case LOGIN:
					info.efetuarLogin();
					break;

				case CADASTRAR_USUARIO:
					info.cadastrarCliente();
					break;

				case BUSCAR_NOTEBOOK:
					info.buscarNotebook();
					break;

				case INSERIR_NOTEBOOK:
					info.manterCarrinho(opcao);
					break;

				case REMOVER_NOTEBOOK:
					info.manterCarrinho(opcao);
					break;

				case VER_CARRINHO:
					info.manterCarrinho(opcao);
					break;

				case EFETUAR_COMPRA:
					if (!info.logado) {
						System.out.println("Efetue login para efetuar compra.");
						break;
					} else {
						info.efetuarCompra();
						break;
					}

				case AJUDA:
					info.ajuda();
					break;

				case AREA_ADMINISTRATIVA:
					info.areaAdministrativa();
					break;
				case SAIR:
					System.out.println("Saída do Sistema");
					break;

				default:
					System.out.println("Opção inválida!");
				}
			} while (opcao != SAIR);
		} catch (NumberFormatException nfe) {
			System.out.println("Opção inválida.\n");

			Teclado.lerTexto("Pressione enter para continuar...");

			main(args);
		}
	}

	public InfoNote() {

		// Cria objeto de configurações

		config = new Configurador();

		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));

		// Cria o objeto Ajuda

		ajuda = new Ajuda(config.getArquivoAjuda());

	}

	public void mostrarMenu() {

		System.out.println("============================================================");
		System.out.println("InfoNote - Se não é Info não vendemos (" + data + " - " + hora + ")");
		if (logado == true) {
			System.out.println("Seja bem vindo - " + cliente.getNomeInvertido());
		}
		System.out.println("============================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook do carrinho");
		System.out.println("6 - Ver carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Área Administrativa");
		System.out.println("10 - Sair");
	}

	public void efetuarLogin() {

		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);

		if (cliente != null) {
			logado = cliente.validarLogin(login, senha);
		} else if (logado) {
			System.out.println("Login Efetuado com sucesso!");
		} else {
			System.out.println("Login ou Senha inválido");
		}

		int opcao2 = 3;

		do {
			System.out.println("Digite:");
			System.out.println("1 - Para efetuar login");
			System.out.println("2 - Para cadastrar-se");
			System.out.println("3 - Para sair do sistema");

			opcao2 = Teclado.lerInt("");

			switch (opcao2) {

			case 1:
				efetuarLogin();
				break;

			case 2:
				cadastrarCliente();
				break;

			case 3:
				sair();
				break;

			default:
				System.out.println("Opção inválida");
			}

		} while (!logado);
	}

	public void efetuarLoginAdm() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);

		if (funcionario != null) {
			logado = funcionario.validarLogin(login, senha);
		} else {
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usuário ou senha inválido.");
			}
		}
	}

	public void areaAdministrativa() {

		InfoNote info = new InfoNote();

		efetuarLoginAdm();

		System.out.println("Opções Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");

		int opcao = 5;

		do {
			opcao = Teclado.lerInt("Digite sua opção: ");

			switch (opcao) {

			case 1:
				info.cadastrarNotebook();
				break;

			case 2:
				info.buscarNotebook();
				break;

			case 3:
				info.editarNotebook();
				break;

			case 4:
				info.excluirNotebook();
				break;

			case 5:
				System.out.println("Saída do Sistema");
				break;

			default:
				System.out.println("Opção inválida!");

			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != 5);
	}

	public void cadastrarCliente() {
		System.out.println("============================================================");
		System.out.println("              InfoNote - Cadastro de Usuários.              ");
		System.out.println("============================================================");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		int tipo = 0; // porque todo cliente é tipo zero
		String codigoCliente = Teclado.lerTexto("Código do Cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");
		System.out.println("Endereço");
		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Número: ");
		String complemento = Teclado.lerTexto("Complemento");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("CEP: ");

		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
		}

		usuario = UsuarioDAO.inserir(login, senha, tipo);

		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome, email, telefone);

		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento, bairro, cidade, estado, cep,
				codigoCliente);

		System.out.println("============================================================");
		System.out.println("              Usuário Cadastrado Com Sucesso.               ");
		System.out.println("============================================================");

		System.out.println(cliente);
		System.out.println(endereco);

	}

	public void cadastrarNotebook() {

		System.out.println("========================================");
		System.out.println("           Cadastro de Notebook         ");
		System.out.println("========================================");

		// serialNote, model, descricao, estoque, precoUnitario, figura, dataCadastro

		String serialNote = Teclado.lerTexto("Serial: ");
		String model = Teclado.lerTexto("Modelo: ");
		String descricao = Teclado.lerTexto("Descrição: ");
		int estoque = Teclado.lerInt("Quantidade no Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preço Unitário: ");
		String figura = Teclado.lerTexto("Local da Figura: ");
		String dataCadastro = data;

		Notebook notebook = NotebookDAO.inserir(serialNote, model, descricao, estoque, precoUnitario, figura,
				dataCadastro);

		System.out.println(notebook);

	}

	public void sair() {
		System.out.println("Saída do Sistema...");
		System.exit(0);
	}

	public void buscarNotebook() {

		List<Notebook> notebooks = new ArrayList<Notebook>();

		notebooks.addAll(NotebookDAO.buscarTodos());

		for (int i = 0; i < notebooks.size(); i++) {

			System.out.println(notebooks.get(i).getSerialNote() + "-----" + notebooks.get(i).getModel() + "-----"
					+ notebooks.get(i).getDescricao() + "-----" + notebooks.get(i).getEstoque() + "-----"
					+ notebooks.get(i).getPrecoUnitario() + "-----" + notebooks.get(i).getFigura() + "-----"
					+ notebooks.get(i).getDataCadastro());

		}
	}

	public void editarNotebook() {

		System.out.println("========================================");
		System.out.println("              Editar Notebook           ");
		System.out.println("========================================");

		String serialNote = Teclado.lerTexto("Digite o número serial do notebook a ser editado: ");
		String descricao = Teclado.lerTexto("Descrição: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Preço Unitário: ");
		String figura = Teclado.lerTexto("Local da Figura: ");
		String dataCadastro = data;

		NotebookDAO.atualizar(serialNote, descricao, estoque, precoUnitario, figura, dataCadastro);

		System.out.println("Notebook atualizado com sucesso.");

	}

	public void excluirNotebook() {

		System.out.println("========================================");
		System.out.println("             Excluir Notebook           ");
		System.out.println("========================================");

		String serialNote = Teclado.lerTexto("Digite o serial do notebook a ser apagado: ");

		NotebookDAO.excluir(serialNote);

		System.out.println("Mensagem apagada com sucesso.");

	}

	public void manterCarrinho(int operacao) {

		// insere notebook no carrinho
		if (operacao == 4) {
			inserirNotebook();
			// visualiza o carrinho

		} else if (operacao == 6) {
			verCarrinho();
		}

	}

	public void verCarrinho() {
		if (pedido == null) {
			System.out.println("Carrinho vazio!");
		} else {
			System.out.println(pedido);
		}
	}

	public void inserirNotebook() {

		// Lê o notebook escolhido do teclado
		String model = Teclado.lerTexto("Informe o modelo do notebook para compra: ");

		// Cria pedido

		if (pedido == null) {
			pedido = new Pedido();
		}

		// Busca notebook selecionado no banco
		Notebook aux = NotebookDAO.buscarPorModelo(model);

		// Se não existir, interrompe
		if (aux == null) {
			return;
		}

		// Cria item
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

		// Insere item no pedido
		pedido.inserirItem(item);

		System.out.println("Item inserido no carrinho com sucesso!");
	}

	public void ajuda() {
		System.out.println(ajuda.getTexto());
	}
	
	public void removerCarrinho() {
		// le o notebook do teclado
		String model = Teclado.lerTexto("Informe o modelo do notebook para remover do carrinho: ");
		
		// buscar notebook selecionado no banco
		Notebook aux = NotebookDAO.buscarPorModelo(model);
		
		// se nao existir, interrompe
		if (aux == null) {
			return;
		}
		
		// cria item a ser removido
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);
		
		pedido.removerItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}

}
