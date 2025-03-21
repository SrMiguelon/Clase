package vectores;

import java.util.Arrays;
import java.util.Random;

public class Ordenacion {

	public static int[] generarArrayAleatorio(int numElementos, int valorMinimo, int valorMaximo) {
		Random random = new Random();
		int[] array = new int[numElementos];
		for (int i = 0; i < numElementos; i++) {
			array[i] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
		}
		return array;
	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					swap(j, i, array);
				}
			}

		}
	}

	public static void swap(int pos1, int pos2, int[] array) {

		int aux = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = aux;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = generarArrayAleatorio(5, 0, 10);
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
