package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Botao extends JFrame {

	public Botao() {

		super("Estudo de botões");

		JButton botao = new JButton("Meu botão");
		botao.addActionListener(new MeuBotaoListener());

		JButton botao2 = new JButton("Meu botão 2");
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "Você clicou no meu botão 2\nlinkado a uma classe anônima");

			}

		});
		botao2.setToolTipText("Botão linkado a classe anônima");

		JPanel painel = new JPanel();
		painel.add(botao2);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Botao();

	}

}
