package ejnota;

public class EjArray {

	public static int[] producto(int[] array, int num) {
		int[] arrayn = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayn[i] = array[i] * num;
		}

		return arrayn;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 5, 3, 4 };
		
		int[] arrayn= producto(array, 5);
		
		for (int i : arrayn) {
			System.out.println(i);
		}
	}

}
