package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {

		// Telas
		JOptionPane.showMessageDialog(null, "Primeira Tela");

		JOptionPane.showMessageDialog(null, "ERROR", "Título", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "INFORMATION", "Título", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "WARNING", "Título", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "QUESTION", "Título", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "PLAIN", "Título", JOptionPane.PLAIN_MESSAGE);

		// Tela com ícone personalizado
		ImageIcon icone = new ImageIcon("img/1.png");

		JOptionPane.showMessageDialog(null, "EXIT", "Sair", JOptionPane.PLAIN_MESSAGE, icone);

	}

}
