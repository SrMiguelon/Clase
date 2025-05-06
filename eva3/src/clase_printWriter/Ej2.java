package clase_printWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File datos = new File("C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\datos.txt");
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(datos));
			pw.println("123");
			pw.println("Hola mundo");
			pw.println("456");
			pw.println("78abc");
			pw.println("789");
			pw.close();
			
			Scanner sc = new Scanner(datos);
			while (sc.hasNextLine()) {
				
				if(sc.hasNextInt()) {
					System.out.println("Numero valido: " + Integer.parseInt(sc.nextLine()));
				}
				else {
					System.out.println("texto o numero no valido: "+sc.nextLine());
				}
				
				
			}
			
			sc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}

	}

}
