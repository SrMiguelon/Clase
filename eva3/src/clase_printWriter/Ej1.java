package clase_printWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ej1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 10 };
		File resultado = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\resultado.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(resultado));
			for (int i = 0; i < array.length; i++) {
				if (array[i] > 2 && array[i] % 2 == 0) {
					pw.println(array[i]);
				}

			}
			pw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
