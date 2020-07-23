package controller;

import model.Cantor;
import model.Estilo;
import model.Musica;

public class Cadastro {

	public static void main(String[] args) {

		Cantor cantor1 = new Cantor(1, "Linkin Park");
		Cantor cantor2 = new Cantor(2, "Metallica");

		Estilo estilo1 = new Estilo(1, "Rock");
		Estilo estilo2 = new Estilo(2, "Metal");

		Musica musica1 = new Musica(1, "Breaking the Habit", 2005, "Live");
		Musica musica2 = new Musica(2, "Numb", 2006, "Live");
		Musica musica3 = new Musica(3, "In the End", 2007, "Live");
		Musica musica4 = new Musica(4, "Meteora", 2007, "Live");
		Musica musica5 = new Musica(5, "Talking to Myself", 2008, "Live");
		Musica musica6 = new Musica(6, "Nothing Else Matter", 1995, "Live");
		Musica musica7 = new Musica(7, "Fade to Black", 1999, "Live");
		Musica musica8 = new Musica(8, "The Unforgiven", 1997, "Live");
		Musica musica9 = new Musica(9, "One", 2000, "Live");
		Musica musica10 = new Musica(10, "Whiskey in the Jar", 2004, "Live");

		cantor1.mostrar();
		estilo1.mostrar();
		musica1.mostrar();
		musica2.mostrar();
		musica3.mostrar();
		musica4.mostrar();
		musica5.mostrar();

		cantor2.mostrar();
		estilo2.mostrar();
		musica6.mostrar();
		musica7.mostrar();
		musica8.mostrar();
		musica9.mostrar();
		musica10.mostrar();

	}

}
