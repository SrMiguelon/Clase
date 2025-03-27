package catch1;

import java.util.Scanner;

public class Ej2 {
	public static void handleSize(int x, int[] v) throws ArrayIndexOutOfBoundsException {
		if (x > v.length) {
			throw new ArrayIndexOutOfBoundsException("fuera de rango: " + x + " Tamaño del array: " + v.length);
		}
		System.out.println("El valor en la posición " + x + " es: " + v[x]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] v = { 1, 2, 3 };
		try {
			handleSize(num, v);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
