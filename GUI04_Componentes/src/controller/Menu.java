package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	JLabel output = new JLabel();

	class Acao implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			output.setText(e.getActionCommand());
		}
	}

	public Menu() {
		super("Estudo de Menu");

		Acao acao = new Acao();

		JMenuBar menuBar = new JMenuBar();

		JMenu menu = new JMenu("Um menu");
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);

		JMenuItem menuItem1 = new JMenuItem("Item de menu");
		menuItem1.setActionCommand("Você clicou em um item de menu!");
		menuItem1.addActionListener(acao);
		menuItem1.setMnemonic(KeyEvent.VK_T);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menu.add(menuItem1);

		ImageIcon iconAbrir = new ImageIcon("img/abrir.png");
		JMenuItem menuItem2 = new JMenuItem("Texto e Icone", iconAbrir);
		menuItem2.setMnemonic(KeyEvent.VK_J);
		menuItem2.setActionCommand("Você clicou em item de menu com texto e icone");
		menuItem2.addActionListener(acao);
		menu.add(menuItem2);

		ImageIcon iconSalvar = new ImageIcon("img/salver.png");
		JMenuItem menuItem3 = new JMenuItem(iconSalvar);
		menuItem3.setMnemonic(KeyEvent.VK_I);
		menuItem3.setActionCommand("Você clicou no item de menu 3");
		menuItem3.addActionListener(acao);
		menu.add(menuItem3);

		menu.addSeparator();

		JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio Button 1");
		radioButtonMenuItem1.setMnemonic(KeyEvent.VK_R);
		radioButtonMenuItem1.setActionCommand("Clicou em Radio Button 1");
		radioButtonMenuItem1.addActionListener(acao);
		menu.add(radioButtonMenuItem1);

		JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio Button 2");
		radioButtonMenuItem2.setMnemonic(KeyEvent.VK_O);
		radioButtonMenuItem2.setActionCommand("Clicou em Radio Button 2");
		radioButtonMenuItem2.addActionListener(acao);
		menu.add(radioButtonMenuItem2);

		ButtonGroup group = new ButtonGroup();
		group.add(radioButtonMenuItem1);
		group.add(radioButtonMenuItem2);

		menu.addSeparator();

		JMenu subMenu = new JMenu("Submenu");
		subMenu.setMnemonic(KeyEvent.VK_S);

		JMenuItem subMenuItem1 = new JMenuItem("Sub menu item 1");
		subMenuItem1.setActionCommand("Clicou em sub menu item 1");
		subMenuItem1.addActionListener(acao);
		subMenu.add(subMenuItem1);

		menu.add(subMenu);

		setJMenuBar(menuBar);
		add(output, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Menu();
	}

}
