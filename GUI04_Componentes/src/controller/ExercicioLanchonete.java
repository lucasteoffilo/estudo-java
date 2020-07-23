package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ExercicioLanchonete extends JFrame {

	private static final double HAMBURGUER = 5.00;
	private static final double X_BURGUER = 6.5;
	private static final double X_EGG = 7.5;
	private static final double X_TUDO = 10;
	private static final double SALADA = 1.5;
	private static final double CARNE_EXTRA = 2;
	private static final double OVO_EXTRA = 2;
	private static final double REFRI_REFIL = 10;

	int item = 1;

	Locale local = new Locale("pt", "BR");
	NumberFormat nf = NumberFormat.getCurrencyInstance(local);

	JLabel sand = new JLabel("Lanche: ");

	JRadioButton hamburguer = new JRadioButton("Hambúrguer - " + nf.format(HAMBURGUER));
	JRadioButton xburguer = new JRadioButton("X-Burguer - " + nf.format(X_BURGUER));
	JRadioButton xegg = new JRadioButton("X-Egg - " + nf.format(X_EGG));
	JRadioButton xtudo = new JRadioButton("X-Tudo - " + nf.format(X_TUDO));

	JLabel comp = new JLabel("Complemento");

	JCheckBox salada = new JCheckBox("Salada - " + nf.format(SALADA));
	JCheckBox carne = new JCheckBox("Carne Extra - " + nf.format(CARNE_EXTRA));
	JCheckBox ovo = new JCheckBox("Ovo extra - " + nf.format(OVO_EXTRA));
	JCheckBox refri = new JCheckBox("Refrigerante Refil - " + nf.format(REFRI_REFIL));

	JButton adicionar = new JButton("Adicionar");
	JButton fechar = new JButton("Fechar Pedido");
	JButton cancelar = new JButton("Cancelar Pedido");
	JButton sair = new JButton("Sair");

	JTextArea sb = new JTextArea(20, 20);

	double valorTotal = 0;

	public ExercicioLanchonete() {

		hamburguer.setActionCommand("Hambúrguer - " + nf.format(HAMBURGUER));
		xburguer.setActionCommand("X-Burguer - " + nf.format(X_BURGUER));
		xegg.setActionCommand("X-Egg - " + nf.format(X_EGG));
		xtudo.setActionCommand("X-Tudo - " + nf.format(X_TUDO));

		ButtonGroup group = new ButtonGroup();

		group.add(hamburguer);
		group.add(xburguer);
		group.add(xegg);
		group.add(xtudo);

		salada.setActionCommand("Salada - " + nf.format(SALADA));
		carne.setActionCommand("Carne Extra - " + nf.format(CARNE_EXTRA));
		ovo.setActionCommand("Ovo extra - " + nf.format(OVO_EXTRA));
		refri.setActionCommand("Refrigerante Refil - " + nf.format(REFRI_REFIL));

		sb.setEditable(false);

		adicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (group.getSelection() != null) {

					sb.append("Lanche " + item + "\n");
					item++;

					if (hamburguer.isSelected()) {
						sb.append(hamburguer.getActionCommand() + "\n");
						valorTotal += HAMBURGUER;
					} else if (xburguer.isSelected()) {
						sb.append(xburguer.getActionCommand() + "\n");
						valorTotal += X_BURGUER;
					} else if (xegg.isSelected()) {
						sb.append(xegg.getActionCommand() + "\n");
						valorTotal += X_EGG;
					} else if (xtudo.isSelected()) {
						sb.append(xtudo.getActionCommand() + "\n");
						valorTotal += X_TUDO;
					}

					if (salada.isSelected()) {
						sb.append(salada.getActionCommand() + "\n");
						valorTotal += SALADA;
					}

					if (carne.isSelected()) {
						sb.append(carne.getActionCommand() + "\n");
						valorTotal += CARNE_EXTRA;
					}
					if (ovo.isSelected()) {
						sb.append(ovo.getActionCommand() + "\n");
						valorTotal += OVO_EXTRA;
					}
					if (refri.isSelected()) {
						sb.append(refri.getActionCommand() + "\n");
						valorTotal += REFRI_REFIL;
					}

					sb.append("\n");

					group.clearSelection();
					salada.setSelected(false);
					carne.setSelected(false);
					ovo.setSelected(false);
					refri.setSelected(false);

				} else {

					JButton b = (JButton) e.getSource();
					JOptionPane.showMessageDialog(b.getParent(), "Primeiro você deve selecionar um lanche.");
				}
			}
		});

		fechar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (sb.equals(null)) {
					sb.append("Seu pedido está sendo preparado!\n" + "Valor Total: " + nf.format(valorTotal) + "\n\n");

					group.clearSelection();
					salada.setSelected(false);
					carne.setSelected(false);
					ovo.setSelected(false);
					refri.setSelected(false);

					item = 1;
				} else {

					JButton b = (JButton) e.getSource();
					JOptionPane.showMessageDialog(b.getParent(), "Primeiro você deve selecionar um lanche.");

				}

			}
		});

		cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (group.getSelection() != null) {
					valorTotal = 0;
					sb.setText("");

					group.clearSelection();
					salada.setSelected(false);
					carne.setSelected(false);
					ovo.setSelected(false);
					refri.setSelected(false);

					item = 1;

				} else {

					JButton b = (JButton) e.getSource();
					JOptionPane.showMessageDialog(b.getParent(), "Primeiro você deve selecionar um lanche.");
				}

			}
		});

		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		JPanel lanche = new JPanel(new GridLayout(5, 1));

		lanche.add(sand);
		lanche.add(hamburguer);
		lanche.add(xburguer);
		lanche.add(xegg);
		lanche.add(xtudo);

		JPanel compl = new JPanel(new GridLayout(5, 1));

		compl.add(comp);
		compl.add(salada);
		compl.add(carne);
		compl.add(ovo);
		compl.add(refri);

		JPanel refeicao = new JPanel(new GridLayout(1, 2));

		refeicao.add(lanche);
		refeicao.add(compl);

		JPanel opt = new JPanel(new GridLayout(4, 1));

		opt.add(adicionar);
		opt.add(fechar);
		opt.add(cancelar);
		opt.add(sair);

		JScrollPane scroll = new JScrollPane(sb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JPanel texto = new JPanel(new GridLayout(1, 1));

		texto.add(scroll);

		add(refeicao, BorderLayout.WEST);
		add(opt, BorderLayout.CENTER);
		add(texto, BorderLayout.EAST);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 200);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ExercicioLanchonete();
	}

}
