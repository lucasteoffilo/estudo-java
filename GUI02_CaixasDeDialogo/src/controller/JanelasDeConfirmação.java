package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeConfirma��o {

	public static void main(String[] args) {

		int opcao1 = JOptionPane.showConfirmDialog(null, "Primeiro Exemplo");

		switch (opcao1) {

		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"Cancelar\"");
			break;

		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"Sim\"");
			break;

		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"N�o\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;
		}

		int opcao2 = JOptionPane.showConfirmDialog(null, "Janela 2", "T�tulo", JOptionPane.OK_CANCEL_OPTION);

		switch (opcao2) {

		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"cancelar\"");
			break;

		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"OK\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;
		}

		int opcao3 = JOptionPane.showConfirmDialog(null, "Janela 3", "T�tulo", JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE);

		switch (opcao3) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"Sim\"");
			break;

		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"N�o\"");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;

		}
		ImageIcon icone = new ImageIcon("img/1.png");
		int opcao4 = JOptionPane.showConfirmDialog(null, "Janela 4", "T�tulo", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, icone);
		
		switch (opcao4) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"sim\"");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"n�o\"");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em \"cancelar\"");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
				break;
		}

	}

}
