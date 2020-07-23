package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AreaDeTextoJanelaComScroll extends JFrame {

	public AreaDeTextoJanelaComScroll() {

		super("Titulo");

		JLabel label = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);

		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);

		JScrollPane sp = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(sp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {

		new AreaDeTextoJanelaComScroll();
	}

}
