package controller;

import model.Aluno;
import model.Professor;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Aluno aluno = new Aluno("João Mendes Silva", "10099876-5", "03556843-06", "21-8755-3456",
				"jmendes_silva@gmail.com", "10001", "Técnico de TI");

		System.out.println(aluno);

		Professor professor = new Professor("Marcelo Roberto Campos", "10054987-7", "075598845-75", "21-7793-8574",
				"mrcampos@senai.rj.gov.br", "901", "TI");

		System.out.println(professor);
	}

}
