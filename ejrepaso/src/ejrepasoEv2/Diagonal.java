package ejrepasoEv2;

public class Diagonal {
	public static int[][] ponerDiagonal(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j == i) {
					matriz[i][j] = 1;

				} else {
					matriz[i][j] = 0;
				}

			}

		}
		return matriz;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Diagonal = new int[6][6];
		Diagonal = ponerDiagonal(Diagonal);
		for (int[] i : Diagonal) {
			for (int a : i) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
