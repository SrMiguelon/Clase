

package vectores;
import java.util.Scanner;

public class Matrices {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 1, 4, 5, 1 }, { 6, 7, 2, 2 }, { 8, 3, 8, 3 }, { 1, 2, 3, 4 } };
		System.out.println("1 4 5 1");
		System.out.println("6 7 2 2");
		System.out.println("8 3 8 3");
		System.out.println("1 2 3 4");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		imprimirMatriz(matriz);
		System.out.println();
		imprimirMatrizinvertida(matriz);
		buscarMatriz(matriz);
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		// declaración y inicialización
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				if (fila == columna) {
					System.out.print(matriz[fila][columna] + " ");
				}
				else {
					System.out.print("\s");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	public static void imprimirMatrizinvertida(int[][] matriz) {
		// declaración y inicialización
		
		for (int fila =matriz.length-1; fila>=0; fila--) {
			for (int columna =0; columna  < matriz[fila].length ; columna++) {
				if (fila + columna == 3 ) {
					System.out.print(matriz[columna][fila] + " ");
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
	public static void buscarMatriz(int[][] matriz) {
		
		System.out.println("numero a buscar");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean haynum = true;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				if (matriz[fila][columna] == num) {
					System.out.println("Esta en la fila: " + fila + " y " + " esta en la columna: " + columna);
					;
				} else {
					haynum = false;
				}
			}
		}
		if (!haynum) {
			System.out.println("no esta ese numero");
		}
	}
}
