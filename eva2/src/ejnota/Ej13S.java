package ejnota;

import java.util.Scanner;

public class Ej13S {
	public static String eliminarl(String frase) {
		String frasen = "";
		frasen += frase.charAt(0);

		for (int i = 1; i < frase.length(); i++) {

			if (frase.charAt(i) != frase.charAt(i - 1)) {
				frasen += frase.charAt(i);
			}

		}
		return frasen;
	}

	public static void main(String[] args) {
		// TODO Auto-generatd method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(eliminarl(sc.nextLine()));
	}

}
