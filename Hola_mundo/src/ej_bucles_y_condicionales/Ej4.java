package ej_bucles_y_condicionales;

import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// introduce n
		System.out.println("Introduce un numero mayor que uno");
		int n = sc.nextInt();
		// si lo pone mal que pruebe otra vez
		while (n < 1) {
			System.out.println("no es mayor que 1, prueba otra vez");
		}
		//i va subiendo, de 1 al numero elegido, si el resto es 0 sera par y avisara
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "es par");
			}

		}
		sc.close();

	}

}
