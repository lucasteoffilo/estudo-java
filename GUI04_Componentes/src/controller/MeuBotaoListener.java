package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MeuBotaoListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		JOptionPane.showMessageDialog(null, "Voc� clicou no meu bot�o com\n MeuBotaoListener linkado");

	}

}
