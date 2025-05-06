package ficherosBinarios;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		File datos = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\datos2.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(datos));

			for (int i = 0; i <= 99999; i++) {
				pw.println(i);
			}
			pw.close();
			BufferedReader br = new BufferedReader(new FileReader(datos));
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			
			
			System.out.println();

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\datosBinarios.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			 for (int i = 0; i <= 9999; i++) {
	                dos.writeInt(i);
	            }
			dos.close();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\datosBinarios.dat");
			DataInputStream dis = new DataInputStream(fis);
			int datos1;
			while ((datos1 = dis.readInt()) != -1) {
				System.out.println(datos1);
			}
			dis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
