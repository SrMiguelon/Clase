package writeAndReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
	public static void main(String[] args) {

		File archivo = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\nuevoArchivo.txt");

		try {
			archivo.createNewFile();
			FileWriter fileWriter = new FileWriter(archivo, true);
			fileWriter.write("Hola\n");
			fileWriter.write("Mundo\n");
			System.out.println(archivo.getAbsolutePath());
			FileReader fr = new FileReader(archivo);
			int c;
			while ((c= fr.read())!= -1) {
				System.out.print((char) c);
				
				
			}
			System.out.println((char) fr.read());

			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
