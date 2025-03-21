package ejnota;

import java.util.Scanner;

public class Ej17ByC {

	public static void arbol() {
		Scanner sc = new Scanner(System.in);
		char estrella = '*';
		char espacio = ' ';
		System.out.println("numero de altura");
		
		int num = sc.nextInt() ;
		
		int numEst = 1;
		int numEsp = num;

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < numEsp; j++) {
				System.out.print(espacio);
			}
			numEsp--;
			for (int u = 0; u < numEst; u++) {
				System.out.print(estrella);
			}
			numEst += 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		arbol();
	}

}
