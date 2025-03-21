package ejnota;

public class VectoresAmorfos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] vector = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 }, { 1, 2, 3,
		// 4, 5 } };
		
		int[][] arrayIrregular = new int[5][];
		
		int contador = 1;
		
		for (int fila = 0; fila < arrayIrregular.length; fila++) {
			
			arrayIrregular[fila] = new int[fila + 1];
			
			for (int columna = 0; columna < arrayIrregular[fila].length; columna++) {
				System.out.print(arrayIrregular[fila][columna] = contador % 10);
				contador++;
			}
			System.out.println();

		}

	}

}
