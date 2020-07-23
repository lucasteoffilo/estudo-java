package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Contato;

@SuppressWarnings("serial")
public class ContatoTableModel extends AbstractTableModel {

	private final List<Contato> contatos;

	public ContatoTableModel(List<Contato> contatos) {

		this.contatos = contatos;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return contatos.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub

		Contato c = contatos.get(linha);

		switch (coluna) {

		case 0:
			return c.getId();
		case 1:
			return c.getNome();
		case 2:
			return c.getEmail();
		case 3:
			return c.getMensagem();
		default:
			break;
		}
		return null;
	}

	public String getColumnName(int column) {

		switch (column) {

		case 0:
			return "ID";
		case 1:
			return "Nome";
		case 2:
			return "E-mail";
		case 3:
			return "Mensagem";
		default:
			return "";
		}
	}

}
