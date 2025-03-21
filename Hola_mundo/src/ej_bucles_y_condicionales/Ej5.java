package ej_bucles_y_condicionales;

import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un numero: ");
		int n = sc.nextInt();

		while (n > 0) {

			int resto = n % 10;
			n = n / 10;
			System.out.println("numeros= " + resto);

		}
		sc.close();
	}

}
