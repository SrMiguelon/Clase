package ejnota;

import java.util.Scanner;

public class Ej11S {

	public static boolean anagramas(String palabra1, String palabra2) {
		boolean verificacion = false;
		if (palabra1.length() == palabra2.length()) {
			for (int i = 0; i < palabra1.length(); i++) {

				for (int z = 0; z < palabra2.length(); z++) {

					if (palabra1.charAt(i) == palabra2.charAt(z)) {
						verificacion = true;
						z = palabra2.length() - 1;
						
					} else if (z == palabra2.length() - 1 && palabra1.charAt(i) != palabra2.charAt(z)) {
						i = palabra1.length() - 1;
						verificacion = false;
					}
				}
			}

		} else {
			System.out.println("no tiene el mismo numero de letras");
		}

		return verificacion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce dos palabras");
		System.out.println(anagramas(sc.next(), sc.next()));

	}

}
