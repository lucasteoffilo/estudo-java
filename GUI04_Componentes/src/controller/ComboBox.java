package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ComboBox extends JFrame {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ComboBox() {

		super("ComboBox");

		final JLabel label = new JLabel("<Nome>");
		String[] vetor = { "um", "dois", "três" };
		JComboBox comboBox = new JComboBox(vetor);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				String conteudo = (String) cb.getSelectedItem();
				label.setText(conteudo);

			}
		});

		JButton exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, comboBox.getSelectedItem());

			}
		});

		JPanel painel = new JPanel();
		painel.add(comboBox);
		painel.add(label);
		painel.add(exibir);

		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ComboBox();

	}

}