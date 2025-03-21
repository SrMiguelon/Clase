package ej_clases;

public class Ej_mal {

	public static void main(String[] args) {
		String mensaje = "Lorem";

		for (int i = 0; i <= mensaje.length()-1; i=i+2) {
			
			System.out.print(mensaje.charAt(i));
			
		}
	}
}
