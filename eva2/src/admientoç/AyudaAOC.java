package admientoç;

import java.io.*;
import java.util.*;

public class AyudaAOC {

	public static String[] leerArchivo(String ruta) {
		List<String> lineas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				lineas.add(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
			return null;
		}

		return lineas.toArray(new String[0]);
	}
}
