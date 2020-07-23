package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaHerenca extends JFrame {

	public JanelaHerenca() {

		super("Título da Janela");

		setTitle("Título da Janela");
		setSize(500, 300);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		setIconImage(icone.getImage());

		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		new JanelaHerenca();
	}

}
