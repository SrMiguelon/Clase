package vectores;

import java.util.Arrays;
import java.util.Random;

public class AlgoritmosOrdenacion {

	public static int[] generarArrayAleatorio(int numElementos, int valorMinimo, int valorMaximo) {
		Random random = new Random();
		int[] array = new int[numElementos];
		for (int i = 0; i < numElementos; i++) {
			array[i] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
		}
		return array;
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Intercambiar el mínimo con el elemento en la posición actual
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Particionar el array
			int pivotIndex = partition(arr, low, high);

			// Ordenar recursivamente las dos mitades
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivotIndex = low + (high - low) / 2; // Elegir el elemento medio como pivote
		int pivot = arr[pivotIndex];
		// Intercambiar el pivote con el último elemento
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[high];
		arr[high] = temp;

		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Intercambiar los elementos
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// Si no hubo intercambios, el array ya está ordenado
			if (!swapped)
				break;
		}
	}

	public static void main(String[] args) {
		// Crear un array aleatorio de 200.000 números
		int[] numsAleatorios = generarArrayAleatorio(200_000, 0, 500);
		int[] testArray; // Array que se va a tener que ordenar
		double tiempoInicio;
		double tiempoFin;

		// SELECTION SORT
		testArray = Arrays.copyOf(numsAleatorios, numsAleatorios.length);
		tiempoInicio = System.currentTimeMillis();
		selectionSort(testArray);
		tiempoFin = System.currentTimeMillis();
		System.out.println("Selection sort -> " + (tiempoFin - tiempoInicio) / 1000 + " segundos.");

		// BUBBLE SORT
		testArray = Arrays.copyOf(numsAleatorios, numsAleatorios.length);
		tiempoInicio = System.currentTimeMillis();
		bubbleSort(testArray);
		tiempoFin = System.currentTimeMillis();
		System.out.println("Bubble sort -> " + (tiempoFin - tiempoInicio) / 1000 + " segundos.");

		// QUICK SORT
		testArray = Arrays.copyOf(numsAleatorios, numsAleatorios.length);
		tiempoInicio = System.currentTimeMillis();
		quickSort(testArray, 0, testArray.length - 1);
		tiempoFin = System.currentTimeMillis();
		System.out.println("Quick sort -> " + (tiempoFin - tiempoInicio) / 1000 + " segundos.");

	}
}
