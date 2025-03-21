package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("introduce un numero: ");
		int n = sc.nextInt();
		int suma = 0;
		while (n > 0) {

			int resto = n % 10;

			suma = resto + suma;
			n = n / 10;
			System.out.println("numeros= " + resto);

		}
		System.out.println("La suma es: " + suma);
		sc.close();
	}

}
