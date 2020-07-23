package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
	
		JFrame janela = new JFrame();
		
		janela.setTitle("T�tulo da Janela");
		janela.setSize(500,300);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/ic_curtir.gif");
		janela.setIconImage(icone.getImage());
		
		janela.setLocationRelativeTo(null);
		
		janela.setVisible(true);
		

	}

}
