package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AreaDeTexto extends JFrame {

	public AreaDeTexto() {

		super("Titulo");

		JLabel label = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);

		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {

		new AreaDeTexto();
	}

}
