package extraRf;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void leerFichero(File nombreArchivo) throws Exception {

		String linea;
		if (nombreArchivo.exists() && nombreArchivo.isFile()) {

			BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			System.out.println();
			
			estadisticas(nombreArchivo);
			br.close();
		} else {
			System.out.println("El archivo no existe en el sistema de archivos.");
		}
	}

	public static void estadisticas(File file) throws Exception {
		File estadisticas = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\estadisticas.txt");
		int numCaracteres, numPalabras;
		int numLineasTotal = 0, numCaracteresTotal = 0, numPalabrasTotal = 0;
		String linea;
		
		ArrayList<Integer> caracteres = new ArrayList<>();
		ArrayList<Integer> palabras = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while ((linea = br.readLine()) != null) {
			numLineasTotal++;
			numCaracteres = 0;
			numPalabras = 0;
			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) != ' ') {
					numCaracteres++;
				}
			}
			numPalabras = linea.split(" ").length;

			numPalabrasTotal += numPalabras;
			numCaracteresTotal += numCaracteres;

			caracteres.add(numCaracteres);
			palabras.add(numPalabras);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(estadisticas));
		for (int i = 0; i < numLineasTotal; i++) {
			
			bw.write("Linea " + (i+1) + " tiene:" + caracteres.get(i) + " caracteres" + " y " + palabras.get(i)
					+ " palabras \n");
		}
		
		bw.write("Total de lineas: "+ numLineasTotal+ " \n"
				+ "Total de caracteres: " + numCaracteresTotal + "\n"
						+ "Total de palabras: " + numPalabrasTotal );
		bw.close();
		
		BufferedReader bre = new BufferedReader(new FileReader(estadisticas));
		while ((linea = bre.readLine()) != null) {
			System.out.println(linea);
		}
		bre.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre del archivo");
		String nombreArchivo = sc.nextLine();
		nombreArchivo += ".txt";
		File texto = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\" + nombreArchivo);

		try {
			leerFichero(texto);

		} catch (Exception e) {
			System.out.println("MAL");
		}
	}

}
