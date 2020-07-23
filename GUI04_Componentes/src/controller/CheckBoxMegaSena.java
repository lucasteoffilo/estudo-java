package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CheckBoxMegaSena extends JFrame {
	JButton botao = new JButton("Apostar");
	JTextField caixaDeTexto = new JTextField(20);
	int quantidade = 0;
	JLabel labelQuantidade = new JLabel("Quantidade: " + quantidade);
	List<JCheckBox> numeros = new LinkedList<JCheckBox>();
	JCheckBox[] numerosVetor = new JCheckBox[60];

	class MeuItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				quantidade++;
				if (quantidade > 6) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					checkBox.setSelected(false);
				}
			} else {
				quantidade--;
			}
			labelQuantidade.setText("Quantidade: " + quantidade);
		}

	}

	public CheckBoxMegaSena() {
		super("Mega Sena");

		MeuItemListener meuItemListener = new MeuItemListener();

		caixaDeTexto.setEditable(false);

		JPanel painelNumeros = new JPanel(new GridLayout(6, 10));

		for (int i = 0; i < 60; i++) {
			String numero = Integer.toString(i + 1);
			JCheckBox checkBox = new JCheckBox(numero);
			checkBox.addItemListener(meuItemListener);
			checkBox.setActionCommand(numero);
			painelNumeros.add(checkBox);
			numeros.add(checkBox);
			numerosVetor[i] = checkBox;
		}

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (quantidade == 6) {
					StringBuffer stringBuffer = new StringBuffer();
					for (JCheckBox jCheckBox : numeros) {
						if (jCheckBox.isSelected()) {
							stringBuffer.append(" - " + jCheckBox.getActionCommand());
						}
					}
					caixaDeTexto.setText(stringBuffer.toString().substring(3));
				} else {
					JOptionPane.showMessageDialog(null, "Aposte 6 números");
				}

			}
		});

		JPanel painelAposta = new JPanel();
		painelAposta.add(botao);
		painelAposta.add(caixaDeTexto);
		painelAposta.add(labelQuantidade);

		add(painelNumeros, BorderLayout.CENTER);
		add(painelAposta, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CheckBoxMegaSena();

	}

}
