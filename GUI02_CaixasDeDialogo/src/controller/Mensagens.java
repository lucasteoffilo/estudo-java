package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {

		// Telas
		JOptionPane.showMessageDialog(null, "Primeira Tela");

		JOptionPane.showMessageDialog(null, "ERROR", "T�tulo", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "INFORMATION", "T�tulo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "WARNING", "T�tulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "QUESTION", "T�tulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "PLAIN", "T�tulo", JOptionPane.PLAIN_MESSAGE);

		// Tela com �cone personalizado
		ImageIcon icone = new ImageIcon("img/1.png");

		JOptionPane.showMessageDialog(null, "EXIT", "Sair", JOptionPane.PLAIN_MESSAGE, icone);

	}

}
