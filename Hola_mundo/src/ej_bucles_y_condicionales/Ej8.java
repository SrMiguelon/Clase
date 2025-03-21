package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int numero = 0;

		do {
			System.out.println("introduce numero: ");
			numero = sc.nextInt();
			suma = suma + numero;

		} while (numero != 0);

		System.out.println("la suma es = " + suma);
		sc.close();

	}

}
