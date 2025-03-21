package ej_clases;

import java.util.Scanner;

public class Ej_variables {

	public static int promedio(int lengua, int historia, int mates) {
		return (lengua + historia + mates) / 3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Que has sacado en lengua?");
		int lengua = sc.nextInt();
		if(lengua>100||lengua<0) {
			System.out.println("mal");
			System.exit(0);
		}
		System.out.println("Que has sacado en historia?");
		int historia = sc.nextInt();
		if(historia>100||historia<0) {
			System.out.println("mal");
			System.exit(0);
		}

		System.out.println("Que has sacado en matematicas?");
		int mates = sc.nextInt();
		if(mates>100||mates<0) {
			System.out.println("mal");
			System.exit(0);
		}

		int promedio = promedio(lengua, historia, mates);

		System.out.println(promedio);

	}

}
