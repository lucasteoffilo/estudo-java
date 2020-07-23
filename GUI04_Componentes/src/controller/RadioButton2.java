package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButton2 extends JFrame {

	ImageIcon iconHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconMulher = new ImageIcon("img/mulher.jpg");
	JLabel label = new JLabel(iconHomem);

	JRadioButton radioHomem = new JRadioButton("Homem");
	JRadioButton radioMulher = new JRadioButton("Mulher");
	ButtonGroup group = new ButtonGroup();

	public RadioButton2() {

		super("Exemplo RadioButton");

		label.setPreferredSize(new Dimension(150, 300));

		radioHomem.setMnemonic(KeyEvent.VK_H);
		radioHomem.setActionCommand("Homem");
		radioHomem.setSelected(true);

		radioMulher.setMnemonic(KeyEvent.VK_M);
		radioMulher.setActionCommand("Mulher");

		group.add(radioHomem);
		group.add(radioMulher);

		radioHomem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconHomem);

			}
		});

		radioMulher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconMulher);

			}
		});

		
		JPanel radioPanel = new JPanel(new GridLayout(2, 1));
		radioPanel.add(radioHomem);
		radioPanel.add(radioMulher);

		RadioButton2 radioButton2 = this;

		JButton botao = new JButton("Exibe");

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String comando = group.getSelection().getActionCommand();
				// JButton b = (JButton) e.getSource();
				JOptionPane.showMessageDialog(radioButton2, comando);

			}
		});

		Container container = getContentPane();

		container.add(radioPanel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);
		container.add(botao, BorderLayout.SOUTH);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {

		new RadioButton2();

	}

}
