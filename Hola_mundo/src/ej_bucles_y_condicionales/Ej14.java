package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej14 {

	public static int npalabras(Scanner sc) {
		System.out.println("Inserta una frase:");

		String frase = sc.nextLine();
		int contador = 0;

		boolean enPalabra = false;
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != ' ') {

				if (!enPalabra) {

					contador++;
					enPalabra = true;
				}
			} else {

				enPalabra = false;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num_palabras = npalabras(sc);
		System.out.println("tiene " + num_palabras + " palabras");

	}

}
