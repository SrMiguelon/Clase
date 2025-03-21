package examen1;

import java.util.Scanner;

public class Examen {
	public static void ejercicio1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero");
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero entero");
		int num2 = sc.nextInt();

		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("Ambos numeros son pares");
		} else if (num1 % 2 != 0 && num2 % 2 != 0) {
			System.out.println("Ambos numeros son impares");
		} else if (num1 % 2 == 0 && num2 % 2 != 0) {
			System.out.println(num1 + " es par y " + num2 + " es impar");
		} else {
			System.out.println(num1 + " es impar y " + num2 + " es par");
		}
	}

	public static void ejercicio2(int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		return;
	}

	public static String ejercicio3(String frase) {
		frase = frase.toLowerCase();
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a') {
				contador++;
			}
		}
		return "hay " + contador + " letras a";
	}

	public static String ejercicio4(String frase) {

		frase = frase.toUpperCase();
		String frasen="";
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == 'A') {
				frasen= frasen + '4';
			} else if (frase.charAt(i) == 'E') {
				frasen= frasen + '3';
			} else if (frase.charAt(i) == 'I') {
				frasen= frasen + '1';
			} else if (frase.charAt(i) == 'O') {
				frasen= frasen + '0';
			} else if (frase.charAt(i) == ' ') {
				frasen= frasen + '_';
			}else {
				frasen= frasen +frase.charAt(i);
			}
			
		}return frasen;
		
	}

	public static String ejercicio5(int num) {
		boolean decre = false;
		while (num > 0 && !decre) {

			// asi sabemos numeroanterior
			int num1 = num % 10;
			// y el nuevo num
			num = num / 10;
			int num2 = num % 10;
			// si el nuevo numero es menos
			if ((num1 > num2) || (num2 == 9 && num1 == 0)) {
			} else {
				decre = true;
			}
		}
		if (decre == true) {
			return "false";
		} else {
			return "true";
		}
	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce del 1 al 5 para elegir un ejercicio");
		
		System.out.println("1. ejercicio1");
		System.out.println("2. ejercicio2");
		System.out.println("3. ejercicio3");
		System.out.println("4. ejercicio4");
		System.out.println("5. ejercicio5");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			ejercicio1();
			break;
		case 2:
			ejercicio2(55);
			break;
		case 3:
			System.out.println(ejercicio3("a America"));
			break;
		case 4:
			System.out.println(ejercicio4("eL caBeCiLla"));
			break;
		case 5:
			
			System.out.println(ejercicio5(1639090));
			break;
		}
	}

	public static void main(String[] args) {
		ejercicio6();
	}

}
