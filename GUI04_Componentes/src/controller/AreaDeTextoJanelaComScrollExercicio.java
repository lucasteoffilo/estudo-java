package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AreaDeTextoJanelaComScrollExercicio extends JFrame {

	public AreaDeTextoJanelaComScrollExercicio() {

		super("Titulo");

		JLabel label = new JLabel("Digite uma mensagem:");
		JTextArea areaDeTexto = new JTextArea(10, 30);

		JButton exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String texto = areaDeTexto.getText();
				JOptionPane.showMessageDialog(null, texto);

			}
		});

		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(exibir);
		painel.add(areaDeTexto);

		JScrollPane sp = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(sp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {

		new AreaDeTextoJanelaComScrollExercicio();
	}

}
