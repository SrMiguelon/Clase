package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("pon tu cadena");
		String cadena = sc.next();
		String ncadena = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			
			ncadena += cadena.charAt(i);
		}
		if (cadena.equals(ncadena)) {
			System.out.println(ncadena + " es palíndromo");
		} else {
			System.out.println(ncadena + " no es palindromo");
		}
		sc.close();
	}

}
