package catch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1x01 {
	public static String solicitarCadena(String mensaje) throws IOException {
		System.out.print(mensaje);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}

	  public static short solicitarEnteroCorto(String mensaje, int numMaxErrores) throws IOException {
	        int intentos = 0;
	        while (intentos < numMaxErrores) {
	            try {
	                String cadena = solicitarCadena(mensaje);
	                return Short.parseShort(cadena);
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Debes introducir un número entero.");
	                intentos++;
	            }
	        }
	        throw new IOException("Número máximo de intentos superado.");
	    }

	public static void main(String[] args) {
		try {
			solicitarEnteroCorto("introduce un mensaje", 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Superaste el limite");
		}
	}

}
