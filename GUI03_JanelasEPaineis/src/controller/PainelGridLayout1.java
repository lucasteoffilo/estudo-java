package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PainelGridLayout1 extends JFrame {

	public PainelGridLayout1() {

		super("T�tulo");

		ImageIcon icone1 = new ImageIcon("img/ic_youtube.png");
		ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
		ImageIcon icone3 = new ImageIcon("img/ic_download.gif");

		JLabel labelTexto = new JLabel("Texto e imagem no painel");
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);

		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(2, 2));
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);

		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {

		new PainelGridLayout1();

	}

}
