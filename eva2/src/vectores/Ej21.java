package vectores;

import java.util.Arrays;

public class Ej21 {
	public static int[] generarArray(int cantidadElementos) {
		int[] arrayNuevo = new int[cantidadElementos];
		for (int i = 0; i < arrayNuevo.length; i++) {
			arrayNuevo[i]=i+1;
			
		}
		return arrayNuevo;
		
	}

public static int binarysearch(int[] arrayOrdenado, int numbuscado) {
	int pivMax= arrayOrdenado.length-1;
	int pivMin= 0;
	
	while (pivMin<=pivMax) {
		int piv = pivMin + (pivMax-pivMin)/2;
		if (arrayOrdenado[piv] == numbuscado) {
			return piv;
		}
		if (arrayOrdenado[piv] > numbuscado) {
			pivMax = piv -1;
		}
		else {
			pivMin= piv+1;
		}
		
	}
	return -1;

	
	
	
	
}
	public static void main(String[] args) {
		int[] array = generarArray(10);
		System.out.println(Arrays.toString(array));
		System.out.println(binarysearch(array, 5 ));

	}

}
