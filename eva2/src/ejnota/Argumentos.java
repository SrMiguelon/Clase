package ejnota;

import java.util.Scanner;

public class Argumentos {
	public static int suma(int num1, int num2) {
		
		return num1 + num2;
	}
		
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if (num1 < 10 && num1 < 10) {
			System.out.println(suma(num1, num2));
		}
		else {
		System.out.println("los numeros tienen que ser menores de 10");
		}

	}

}
