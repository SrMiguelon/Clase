package ej_bucles_y_condicionales;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("mete numero");
		int num = sc.nextInt();
		int mult = 1;

		while (num >= 0) {
			System.out.println("Tiene que ser un numero negativo, vuelve a intentarlo ");
			num = sc.nextInt();
		}

		num = Math.abs(num);
		for (int i = 1; i <= num; i++) {
			mult = mult * i;
		}
		System.out.println("el factorial es " + mult);
		sc.close();

	}

}
