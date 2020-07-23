package controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CaixaDeTexto extends JFrame {

	public static void main(String[] args) {

		new CaixaDeTexto();

	}

	public CaixaDeTexto() {

		super("Estudo de caixas de texto");

		JTextField caixaDeTexto = new JTextField(20);

		JPanel painel = new JPanel();
		painel.add(caixaDeTexto);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);

	}

}
