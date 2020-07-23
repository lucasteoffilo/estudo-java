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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButton extends JFrame {

	ImageIcon iconHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconMulher = new ImageIcon("img/mulher.jpg");
	JLabel label = new JLabel(iconHomem);

	public RadioButton() {

		super("Exemplo RadioButton");

		label.setPreferredSize(new Dimension(150, 300));

		JRadioButton radioHomem = new JRadioButton("Homem");
		radioHomem.setMnemonic(KeyEvent.VK_H);
		radioHomem.setSelected(true);

		JRadioButton radioMulher = new JRadioButton("Mulher");
		radioMulher.setMnemonic(KeyEvent.VK_M);

		ButtonGroup group = new ButtonGroup();
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

		Container container = getContentPane();

		container.add(radioPanel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {

		new RadioButton();

	}

}
