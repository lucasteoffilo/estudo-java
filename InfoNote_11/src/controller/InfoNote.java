package controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import model.Cliente;
import model.Endereco;
import model.GerarSenha;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import util.Ajuda;
import util.Configurador;
import util.Teclado;

public class InfoNote {

	Cliente cliente = new Cliente();

	Notebook notebooks[] = new Notebook[10];

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
	private static final int SAIR = 9;

	Configurador config;
	Ajuda ajuda;

	public static void main(String[] args) throws Exception {

		InfoNote info = new InfoNote();

		int opcao = SAIR;

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
				info.inserirNotebook();
				break;

			case REMOVER_NOTEBOOK:
				info.manterCarrinho();
				break;

			case VER_CARRINHO:
				info.manterCarrinho();
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

			case SAIR:
				System.out.println("Saída do Sistema");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != SAIR);
		Teclado.lerTexto("Pressione uma tecla para continuar...");
	}

	public InfoNote() throws Exception {

		// Cria objeto de configurações

		config = new Configurador();

		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));

		// Cria o objeto Ajuda

		ajuda = new Ajuda(config.getArquivoAjuda());

		notebooks[0] = new Notebook("1", "Negativo N22BR", "CPU Intel Core 2 Duo, Memória 2GB, HD 250GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2018");

		notebooks[1] = new Notebook("2", "Bell B55BR", "CPU Intel i3, Memória 4GB, HD 500GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2018");

		notebooks[2] = new Notebook("3", "Pompaq P41BR", "CPU Intel i3, Memória 3GB, HD 320GB", 1, 1600.00,
				"img\\cr71ch.jpg", "10/06/2018");

		notebooks[3] = new Notebook("4", "CCF CR71CH", "CPU Intel Dual Core, Memória 2GB, HD 160GB", 5, 1100.00,
				"img\\bd22br.jpg", "10/06/2018");

		notebooks[4] = new Notebook("5", "BradescoTech BD22BR", "CPU AMD Phenon II, Memória 4GB, HD 500 GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2018");

	}

	public void mostrarMenu() {

		DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT);
		Calendar data = new GregorianCalendar();
		String data1 = formatoData.format(data.getTime());

		// TimeZone hora = TimeZone.getTimeZone("GMT-3:00");
		// TimeZone.setDefault(hora);
		String hora1 = (DateFormat.getTimeInstance().format(new Date()));

		System.out.println("============================================================");
		System.out.println("InfoNote - Se não é Info não vendemos (" + data1 + " - " + hora1 + ")");
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
		System.out.println("9 - Sair");
	}

	public void efetuarLogin() {

		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		if (cliente != null) {
			logado = cliente.validarLogin(login, senha);
			if (logado) {
				System.out.println("Login Efetuado com sucesso!");
			} else {
				System.out.println("Login ou Senha inválido");
				efetuarLogin();
			}
		}
	}

	public void cadastrarCliente() {
		System.out.println("============================================================");
		System.out.println("              InfoNote - Cadastro de Usuários.              ");
		System.out.println("============================================================");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		int tipo = Teclado.lerInt("Tipo: ");
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

		Endereco end = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);

		cliente = new Cliente(login, senha, tipo, codigoCliente, nome, email, telefone, end);

		System.out.println("============================================================");
		System.out.println("              Usuário Cadastrado Com Sucesso.               ");
		System.out.println("============================================================");

		System.out.println(cliente);

	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getNumeroNote() + "-----" + notebooks[i].getModel());
			}
		}
	}

	public void manterCarrinho() {

		inserirNotebook();

	}

	public void inserirNotebook() {

		// Lê o notebook escolhido do teclado
		String numeroNote = Teclado.lerTexto("Informe o número do notebook para compra: ");

		// Cria pedido

		if (pedido == null) {
			pedido = new Pedido();
		}

		// Busca notebook selecionado
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())) {
				aux = notebooks[i];
			}
		}

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

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}

}
