package ejrepasoEv2;

public class Esquinas {
	public static void mostrarEsquinas(int[][] matriz) {
		System.out.println(matriz[0][0]);
		System.out.println(matriz[0][matriz.length]);
		System.out.println(matriz[matriz.length-1][0]);
		System.out.println(matriz[matriz.length-1][matriz.length]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 7, 8, 9, 10 } };
		mostrarEsquinas(matriz);
	}

}
