package ejnota;

import java.util.Scanner;

public class Ej11VectorS {

	public static String[] rellenar(Scanner sc) {
		String[] nuevo = new String[2];
		for (int fila = 0; fila < nuevo.length; fila++) {
			nuevo[fila] = sc.next();
		}
		return nuevo;
	}

	public static boolean anagrama(String[] anagrama) {
		if (anagrama[0].length() == anagrama[1].length()) {
			for (int i = 0; i < anagrama[0].length(); i++) {
				for (int j = 0; j < anagrama[1].length(); j++) {
					if (anagrama[0].charAt(i) == anagrama[1].charAt(j)) {
						j=anagrama[1].length()-1;
					}
					else if(anagrama[0].charAt(i) != anagrama[1].charAt(j) && j == anagrama[1].length() - 1) {
						return false;
					}
				}
			}
		} else {
			System.out.println("no coincide de tamaño");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] anagrama = rellenar(sc);
		System.out.println(anagrama(anagrama));
	}
}
