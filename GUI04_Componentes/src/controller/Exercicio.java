package controller;

import java.awt.BorderLayout;
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
public class Exercicio extends JFrame {

	ImageIcon iconRJ = new ImageIcon("img/rj.jpg");
	ImageIcon iconSP = new ImageIcon("img/sp.jpg");
	ImageIcon iconBR = new ImageIcon("img/br.jpg");
	ImageIcon iconAM = new ImageIcon("img/am.jpg");
	ImageIcon iconRO = new ImageIcon("img/ro.jpg");

	JLabel label1 = new JLabel("Qual a capital do Brasil?");

	JLabel bandeiraBR = new JLabel(iconRJ);

	JRadioButton rioDeJaneiro = new JRadioButton("Rio de Janeiro");
	JRadioButton saoPaulo = new JRadioButton("São Paulo");
	JRadioButton brasilia = new JRadioButton("Brasília");
	JRadioButton amapa = new JRadioButton("Amapá");
	JRadioButton roraima = new JRadioButton("Roraima");

	ImageIcon iconTX = new ImageIcon("img/tx.jpg");
	ImageIcon iconFL = new ImageIcon("img/fl.jpg");
	ImageIcon iconCA = new ImageIcon("img/ca.jpg");
	ImageIcon iconOH = new ImageIcon("img/oh.jpg");
	ImageIcon iconWDC = new ImageIcon("img/wdc.jpg");

	JLabel label2 = new JLabel("Qual a capital dos EUA?");

	JLabel bandeiraEUA = new JLabel(iconTX);

	JRadioButton texas = new JRadioButton("Texas");
	JRadioButton florida = new JRadioButton("Florida");
	JRadioButton california = new JRadioButton("California");
	JRadioButton ohio = new JRadioButton("Ohio");
	JRadioButton washington = new JRadioButton("Washington");

	ButtonGroup group1 = new ButtonGroup();
	ButtonGroup group2 = new ButtonGroup();

	public Exercicio() {

		super("Exercício");

		rioDeJaneiro.setMnemonic(KeyEvent.VK_J);
		rioDeJaneiro.setActionCommand("ERROU!");
		rioDeJaneiro.setSelected(true);

		saoPaulo.setMnemonic(KeyEvent.VK_S);
		saoPaulo.setActionCommand("ERROU!");

		brasilia.setMnemonic(KeyEvent.VK_B);
		brasilia.setActionCommand("ACERTOU!");

		amapa.setMnemonic(KeyEvent.VK_A);
		amapa.setActionCommand("ERROU!");

		roraima.setMnemonic(KeyEvent.VK_R);
		roraima.setActionCommand("ERROU!");

		group1.add(rioDeJaneiro);
		group1.add(saoPaulo);
		group1.add(brasilia);
		group1.add(amapa);
		group1.add(roraima);

		rioDeJaneiro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraBR.setIcon(iconRJ);

			}
		});

		saoPaulo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraBR.setIcon(iconSP);

			}
		});

		brasilia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraBR.setIcon(iconBR);

			}
		});

		amapa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraBR.setIcon(iconAM);

			}
		});

		roraima.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraBR.setIcon(iconRO);

			}
		});

		texas.setMnemonic(KeyEvent.VK_T);
		texas.setActionCommand("ERROU!");
		texas.setSelected(true);

		florida.setMnemonic(KeyEvent.VK_F);
		florida.setActionCommand("ERROU!");

		california.setMnemonic(KeyEvent.VK_C);
		california.setActionCommand("ERROU!");

		ohio.setMnemonic(KeyEvent.VK_O);
		ohio.setActionCommand("ERROU!");

		washington.setMnemonic(KeyEvent.VK_W);
		washington.setActionCommand("ACERTOU!");

		group2.add(texas);
		group2.add(florida);
		group2.add(california);
		group2.add(ohio);
		group2.add(washington);

		texas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraEUA.setIcon(iconTX);

			}
		});

		florida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraEUA.setIcon(iconFL);

			}
		});

		california.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraEUA.setIcon(iconCA);

			}
		});

		ohio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraEUA.setIcon(iconOH);

			}
		});

		washington.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bandeiraEUA.setIcon(iconWDC);

			}
		});

		Exercicio exercicio = this;

		JButton resposta = new JButton("Resultado");

		resposta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String comando = group1.getSelection().getActionCommand();

				String comando2 = group2.getSelection().getActionCommand();

				JOptionPane.showMessageDialog(exercicio, label1.getText() + "\nO certo é Brasília \nVocê " + comando
						+ "\n\n" + label2.getText() + "\nO certo é Washington \nVocê " + comando2);

			}
		});
		

		JPanel brasil = new JPanel(new GridLayout(6, 1));

		brasil.add(label1);
		brasil.add(rioDeJaneiro);
		brasil.add(saoPaulo);
		brasil.add(brasilia);
		brasil.add(amapa);
		brasil.add(roraima);

		JPanel eua = new JPanel(new GridLayout(6, 1));

		eua.add(label2);
		eua.add(texas);
		eua.add(florida);
		eua.add(california);
		eua.add(ohio);
		eua.add(washington);

		JPanel all = new JPanel(new GridLayout(2, 1));

		all.add(brasil);
		all.add(eua);

		JPanel imagens = new JPanel(new GridLayout(2, 1));

		imagens.add(bandeiraBR);
		imagens.add(bandeiraEUA);

		add(all, BorderLayout.WEST);
		add(imagens, BorderLayout.CENTER);
		add(resposta, BorderLayout.SOUTH);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Exercicio();

	}

}