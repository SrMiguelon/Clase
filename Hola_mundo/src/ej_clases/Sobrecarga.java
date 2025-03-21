package ej_clases;

import java.util.Scanner;

public class Sobrecarga {
	// calculo del area del cuadrado
	public static double acuadrado(double num) {
		double area = num * num;
		return area;
	}

	// calcular el area del circulo
	public static double atriangulo(double base, double altura) {

		double area = (base * altura)/2;

		return area;
	}

	// menu
	public static void menu() {
		System.out.println("Calcula el area.");
		System.out.println("1 del cuadrado ");
		System.out.println("2 del circulo");
		System.out.println("0 salir");
	}

	public static void main(String[] args) {

		menu();

		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();

		double numero = 0;

		switch (opcion) {

		case 0:
			System.out.println("has salido");
			System.exit(0);
			break;

		case 1:
			System.out.println("introduce el lado");
			numero = acuadrado(sc.nextDouble());
			System.out.println("el area es " + numero);
			break;

		case 2:
			System.out.println("introduce altura y base");
			numero = atriangulo(sc.nextDouble(), sc.nextDouble());
			System.out.println("el area es " + numero);
			break;
		}
		sc.close();

	}

}
