package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MeuBotaoListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		JOptionPane.showMessageDialog(null, "Você clicou no meu botão com\n MeuBotaoListener linkado");

	}

}
