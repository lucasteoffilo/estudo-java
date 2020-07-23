package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {

		JFrame tela = new JFrame("Programação Java GUI");
		JLabel texto = new JLabel("Alô, Mundo!!!");

		tela.setLayout(null);
		tela.getContentPane().add(texto);

		texto.setBounds(30, 20, 210, 20); // tamanho do texto

		tela.setSize(400, 100); // tamanho da janela

		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // botão fechar
		tela.setVisible(true);
	}

}
