package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeEntrada {

	public static void main(String[] args) {

		String texto1 = JOptionPane.showInputDialog("Janela de Entrada 1");
		JOptionPane.showMessageDialog(null, "Voc� digitou" + texto1);

		String texto2 = JOptionPane.showInputDialog(null, "Janela de Entrada 2");
		JOptionPane.showMessageDialog(null, "Voc� digitou" + texto2);

		String texto3 = JOptionPane.showInputDialog("Janela de Entrada 3", "Valor Inicial da Janela de Entrada 3");
		JOptionPane.showMessageDialog(null, "Voc� digitou: " + texto3);

		String texto4 = JOptionPane.showInputDialog(null, "Janela de Entrada 4",
				"Valor inicial da janela de entrada 4");
		JOptionPane.showMessageDialog(null, "Voc� digitou: " + texto4);

		String texto5 = JOptionPane.showInputDialog(null, "Janela de Entrada 5", "T�tulo da Janela de Entrada 5",
				JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Voc� digitou: " + texto5);

		ImageIcon icone = new ImageIcon("img/1.png");
		String[] vetString = { "Fabr�cio", "Rodrigo", "Xic�o", "PC" };
		Object objeto = JOptionPane.showInputDialog(null, "Janela de Entrada 6", "T�tulo da janela de entrada 6",
				JOptionPane.PLAIN_MESSAGE, icone, vetString, vetString[3]);
		JOptionPane.showMessageDialog(null, "Voc� selecionou: " + objeto);

	}

}
