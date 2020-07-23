package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class CaixaDeSenha extends JFrame {

	public CaixaDeSenha() {

		super("Estudo de caixas de senha");
		JLabel labelSenha = new JLabel("Senha: ");

		JPasswordField caixaDeSenha = new JPasswordField(20);

		JButton botao = new JButton("Exibe senha");
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = new String(caixaDeSenha.getPassword());
				JOptionPane.showMessageDialog(null, "Sua senha: " + senha);

			}
		});

		JPanel painel = new JPanel();
		painel.add(labelSenha);
		painel.add(caixaDeSenha);
		painel.add(botao);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new CaixaDeSenha();
	}

}
