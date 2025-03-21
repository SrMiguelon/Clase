package examen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Examen {
	public static int[] ejercicio1(int[] v1, int[] v2) {

		int[] vectorResultante = new int[5];
		for (int i = 0; i < vectorResultante.length; i++) {
			vectorResultante[i] = v1[i] + v2[i];
		}
		return vectorResultante;
	}

	public static int ejercicio2(int[][] matriz) {
		int total = 0;
		for (int[] i : matriz) {
			for (int j : i) {
				total += j;
			}
		}
		return total;
	}

	public static String[] ejercicio3(String[] cad1, String[] cad2) {
		String[] ciudadesFusion = new String[cad1.length + cad2.length];
		int j = 0;
		for (int i = 0; i < cad1.length; i++) {
			ciudadesFusion[j] = cad1[i];
			j++;
		}
		for (int i = 0; i < cad2.length; i++) {
			ciudadesFusion[j] = cad2[i];
			j++;
		}
		return ciudadesFusion;
	}

	public static void ejercicio4(double[][] matriz) {
		System.out.println(matriz[0][0]);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == matriz[i].length - 1 && i == 0) {
					System.out.println(matriz[i][j]);
				} else if (i == matriz.length - 1 && j == 0) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		System.out.println(matriz[matriz.length - 1][matriz.length - 1]);
	}

	public static int[] ejercicio5(int[] array) {
		int[] arrayInvertido = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			arrayInvertido[j] = array[i];
			j++;
		}
		return arrayInvertido;
	}

	public static void ejercicio6() {
		System.out.println("introdice el tamaño del array con un numero entero");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("introduce un numero en la posicion: " + i);
			array[i] = sc.nextInt();
		}
		int[] arrayCopia = Arrays.copyOf(array, array.length);
		Arrays.sort(arrayCopia);
		System.out.println(Arrays.toString(arrayCopia));
		System.out.println("introduce un numero entero");
		int num = sc.nextInt();
		int max = arrayCopia.length / 2;
		int min = 0;
		boolean encontrado = false;

		Arrays.binarySearch(arrayCopia, num);
	}

	public static void main(String[] args) {
		/*
		 * int[] v1 = {3,2,4,5,7}; int[] v2 = {6,4,2,9,1};
		 * System.out.println(Arrays.toString(ejercicio1(v1, v2)));
		 */
		/*
		 * int [][] matriz = { {3,6,8}, {1,10,3}, {4,6,7} };
		 * System.out.println(ejercicio2(matriz));
		 */
		/*
		 * String[] ciudades1 = {"Barcelona", "Tokio", "Madrid"}; String[] ciudades2 =
		 * {"Buenos Aires", "Zaragoza"};
		 * System.out.println(Arrays.toString(ejercicio3(ciudades1, ciudades2)));
		 */
		/*
		 * double[][] matriz = { { 2.1, 3.0, 3.1 }, { 12.2, 133.0, 4.5 }, { 11.7, 8.2,
		 * 5.4 } }; ejercicio4(matriz);
		 */
		/*
		 * int[] vector1= {3,2,4,5,7};
		 * System.out.println(Arrays.toString(ejercicio5(vector1)));
		 */
		 ejercicio6(); 

	}

}