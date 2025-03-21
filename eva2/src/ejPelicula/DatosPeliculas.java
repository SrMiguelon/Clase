package ejPelicula;

import java.util.Scanner;

public class DatosPeliculas {

	public static void mostrarInformacion(Pelicula peli) {
		
		System.out.println(peli.getTitulo());
		System.out.println(peli.getMinutosDuracion());
		System.out.println(peli.isDobladaCastellano());
		System.out.println(peli.getPuntuacion());
		System.out.println(Pelicula.getPelisVistas());
	}

	public static Pelicula crearPelicula() {

		Pelicula peli1 = new Pelicula("hola", 0, false, 5);

		return peli1;

	}

	public static void main(String[] args) {
	
		for (int i = 1; i <= 5; i++) {
			System.out.println("pelicula " + i); mostrarInformacion(crearPelicula());
		}

	}

}
