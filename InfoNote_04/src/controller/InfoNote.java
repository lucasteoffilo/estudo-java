package controller;

import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;
import util.Teclado;

public class InfoNote {

	Usuario user = new Usuario();

	Notebook notebooks[] = new Notebook[10];

	Pedido pedido;

	boolean logado = false;

	public static void main(String[] args) {

		InfoNote info = new InfoNote();

		int opcao = 8;

		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");

			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.cadastrarUsuario();
				break;

			case 3:
				info.buscarNotebook();
				break;

			case 4:
				info.manterCarrinho();
				break;

			case 5:
				info.manterCarrinho();

			case 6:
				info.manterCarrinho();

			case 7:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Saída do Sistema.");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 8);
		Teclado.lerTexto("Pressione uma tecla para continuar...");
	}

	public InfoNote() {
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

		System.out.println("==================================================");
		System.out.println("      InfoNote - Se não é Info não vendemos");
		System.out.println("==================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook do carrinho");
		System.out.println("6 - Ver carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {

		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		} else {
			System.out.println("Login ou Senha inválido");
			efetuarLogin();
		}
	}

	public void cadastrarUsuario() {
		System.out.println("============================================================");
		System.out.println("              InfoNote - Cadastro de Usuários.              ");
		System.out.println("============================================================");
		int matricula = Teclado.lerInt("Matrícula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		user = new Usuario(matricula, login, senha, nome, email, telefone);

		System.out.println("============================================================");
		System.out.println("              Usuário Cadastrado Com Sucesso.               ");
		System.out.println("============================================================");

		user.mostrar();

	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getNumeroNote() + "-----" + notebooks[i].getModel());
			}
		}
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Construção");
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
		@SuppressWarnings("unused")
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario());
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}

}
