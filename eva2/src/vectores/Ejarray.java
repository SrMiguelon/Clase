package vectores;

import java.util.*;

public class Ejarray {

	public static int[] arrayAleatorio(int numeros, int numMayor, int numMenor) {
		int[] num = new int[numeros];

		for (int i = 0; i < num.length; i++) {

			int aleatorio = (int) (Math.random() * numMayor) + numMenor;

			num[i] = aleatorio;

		}
		return num;
	}

	public static int[] crearNotas() {
		int[] notas = new int[30];

		for (int i = 0; i < notas.length; i++) {
			int aleatorio = (int) (Math.random() * 100);
			notas[i] = aleatorio;
		}

		return notas;

	}

	public static int[] notasOrdenadas(int[] copia) {
		System.out.println("Notas ordenadas: ");
		Arrays.sort(copia);
		return copia;

	}

	public static boolean noventa(int[] copia) {
		int noventa = Arrays.binarySearch(copia, 90);

		if (noventa < 0) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean iguales(int[] copia, int[] original) {
		System.out.println("son iguales: ");
		return Arrays.equals(original, copia);
	}

	public static void calificaciones() {

		int[] notas = crearNotas();

		System.out.println("Notas: ");
		System.out.println(Arrays.toString(notas));

		System.out.println();

		int[] copiaNotas = Arrays.copyOf(notas, notas.length);

		copiaNotas = notasOrdenadas(copiaNotas);

		System.out.println(Arrays.toString(copiaNotas));

		System.out.println();

		System.out.println("alguien ha sacado 90?");
		System.out.println(noventa(copiaNotas));

		System.out.println();
		System.out.println(iguales(copiaNotas, notas));

		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] ej1 = arrayAleatorio(5, 10, 0); for (int i : ej1) { System.out.print(i
		 * + " "); }
		 */

		calificaciones();
	}

}
