package vectores;

import java.util.Arrays;

public class Foreach {

	public static void saludo(String[] nombres) {
		System.out.println("NOMBRES: ");
		for (String i : nombres) {
			System.out.println("hola " + i);
		}
	}

	public static int suma(int[] num) {
		System.out.println("SUMA: ");
		int suma = 0;
		for (int i : num) {
			suma += i;
		}

		return suma;

	}

	public static void imprimir(int[][] matriz) {
		System.out.println("IMPRIMIR: ");
		for (int[] i : matriz) {
			System.out.println(Arrays.toString(i));
		}
	}

	public static int numGrande(int[][] matrizB) {
		System.out.println("NUMERO MAS GRANDE");
		int numGrande = matrizB[0][0];

		for (int[] i : matrizB) {
			for (int j : i) {
				if (numGrande < j) {
					numGrande = j;
				}

			}
		}

		return numGrande;

	}

	public static void main(String[] args) {
		
		String[] nombres = { "Juan", "Maria", "Laura" };
		saludo(nombres);
		
		System.out.println();
		
		int[] num = { 1, 43, 20, 4, 5 };
		System.out.println("total es : " + suma(num));
		 
		System.out.println();	
		
		int[][] matrizA = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		imprimir(matrizA);
		
		System.out.println();
		
		int[][] matrizB = { { 5, 50, 6, 60 }, { 80, 8, 1, 10 }, { 70, 80, 900, 60 } };
		System.out.println(numGrande(matrizB));

	}
}
