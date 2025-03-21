package ej_bucles_y_condicionales;

import java.util.*;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("inserta el primer numero");
		int num1 = sc.nextInt();
		System.out.println("inserta el segundo numero");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println(num1 + " es mayor que " + num2);
		}
		
		sc.close();
	}

}
