package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int primo = 0;
		if (num > 1) {
			// Un for para saber si es primo
			for (int i = 2; i < num; i++) {
				primo = num % i;
				if (primo == 0) {
					System.out.println("no es primo");
					System.exit(0);
				}
			}
			System.out.println("es primo");
		}
		sc.close();

	}

}
