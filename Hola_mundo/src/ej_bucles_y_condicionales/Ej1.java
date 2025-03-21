package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//declarar variables
		int nota;
		
		//preguntar y pedir
		System.out.println("dime que nota has sacado:");
		nota = sc.nextInt();
		
		//si supera los limites que vuelva a preguntar
		while (nota < 0 || nota > 100) {
			System.out.println("mal, introduce otra vez la nota");
			nota = sc.nextInt();
		}
		
		//0<50 = suspenso o 50<100 aprobado
		if (nota < 50) {
			System.out.println("Has suspendido con un " + nota);

		} else {
			System.out.println("Has aprobado con un " + nota);

		}

		sc.close();
	}

}
