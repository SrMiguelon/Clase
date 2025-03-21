package act1;

import java.util.Scanner;

public class Actividad_1x01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nombre?");
		String nombre = sc.next();
		System.out.println("desarrollador?");
		String desarrollador = sc.next();
		System.out.println("año?");
		int año = sc.nextInt();
		System.out.println("numero max de jugadores?");
		int numMaxjugadores = sc.nextInt();
		Videojuego v1 = new Videojuego(nombre, desarrollador, año, numMaxjugadores);

		System.out.println(v1.obtenerEstado());

		System.out.println("nombre?");
		nombre = sc.next();
		System.out.println("desarrollador?");
		desarrollador = sc.next();
		System.out.println("año?");
		año = sc.nextInt();
		System.out.println("numero max de jugadores?");
		numMaxjugadores = sc.nextInt();
		Videojuego v2 = new Videojuego(nombre, desarrollador, año);

		System.out.println(v2.obtenerEstado());
		System.out.println();

		System.out.println("nombre?");
		nombre = sc.next();
		System.out.println("desarrollador?");
		desarrollador = sc.next();
		System.out.println("año?");
		año = sc.nextInt();
		System.out.println("numero max de jugadores?");
		numMaxjugadores = sc.nextInt();
		Videojuego v3 = new Videojuego(nombre, desarrollador);

		System.out.println(v3.obtenerEstado());
	}

}
