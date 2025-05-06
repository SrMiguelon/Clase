package extraRf;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File entrada = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\entrada.txt");
		File salida = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\salida.txt");
		ArrayList<String> entradaLista = new ArrayList<String>();
		try {
			FileWriter fileWriter = new FileWriter(entrada);
			fileWriter.write("Este es el principio \n" + "Hola \n" + "Este es un fichero de texto \n" + "Adiós \n"
					+ "Este es el fin \n");
			fileWriter.close();

			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(entrada));

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
				entradaLista.add(linea);
			}

			bufferedReader.close();
			

			System.out.println();

			FileWriter fileWriterSalida = new FileWriter(salida);
			for (int i = entradaLista.size() - 1; i >= 0; i--) {
				fileWriterSalida.write(entradaLista.get(i) + "\n");
			}
			fileWriterSalida.close();

			BufferedReader bufferSalida = new BufferedReader(new FileReader(salida));
			while ((linea = bufferSalida.readLine()) != null) {
				System.out.println(linea);
			}

			bufferSalida.close();
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
