package ejSem3;

public class Ej3 {

	public static void ordenarArray(boolean[] array) {
		int puntero = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				boolean temporal = array[i];
				array[i] = array[puntero];
				array[puntero] = temporal;
				
				puntero++;
			}
		}
		
		for (boolean b : array) {
			System.out.print(b + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] array = { false, true, false, true, false, true };
		ordenarArray(array);
	}

}
