package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej13 {
	public static String calcular_palabra(Scanner sc) {
		System.out.println("Introduce tu frase:");
		String frase = sc.nextLine() + " ";
		String palabra = "";

		int posicion = 0;

		int PalabraMasLarga = 0;

		for (int i = 0; i < frase.length(); i++ ) {
			
			// Encuentra hueco o ultima letra de la frase ya que no hay espacio
			if (frase.charAt(i) == ' ') {

				// Calculamos la longitud de la palabra actual
				int numletras = i - posicion;

				// comprobamos si la palabra es mas larga que la anterior
				if (numletras > PalabraMasLarga) {
					// Actualizamos la palabra con mas letras
					PalabraMasLarga = numletras;
					// Guardamos la palabra
					palabra = frase.substring(posicion, i);
				}

				// Actualizamos la posición al siguiente carácter después del espacio
				posicion = i + 1;
			}
			
		}

		return "La palabra " + palabra + " tiene " + PalabraMasLarga + " letras.";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String frase = calcular_palabra(sc);
		System.out.println(frase);

	}

}
