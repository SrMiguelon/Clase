package clases.tiempo;

import java.util.Scanner;

public class TiempoMain {
	static Scanner sc = new Scanner(System.in);

	public static Tiempo leerTiempo() {
		int horas, minutos, segundos;
		do {
			System.out.print("Introduce las horas del nuevo tiempo: ");
			horas = sc.nextInt();
			System.out.print("Introduce los minutos del nuevo tiempo: ");
			minutos = sc.nextInt();
			System.out.print("Introduce los segundos del nuevo tiempo: ");
			segundos = sc.nextInt();
			System.out.println();
		} while (!Tiempo.validar(horas, minutos, segundos));

		// sc.close();
		return new Tiempo(horas, minutos, segundos);
	}
	

	public static void mostrarMenu() {
		System.out.println("""
				Introduce un número:
				0 - Salir programa
				1 - Leer tiempo
				2 - Tiempo asignado
				3 - Sumar tiempos
				4 - Restar tiempos
				""");
	}

	public static void main(String[] args) {
		Tiempo t = null;
		int opcion;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 0:
				continuar = false;
				break;
			case 1:
				t = leerTiempo();
				break;
			case 2:
				if (t == null) {
					System.out.println("No existe ningún tiempo válido creado.");
				} else {
					System.out.println(t.obtenerEstado());
				}
				break;
			case 3:
				try {
					t.sumar(t);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				break;
			case 4:
				try {
					Tiempo t2 = new Tiempo(24,24 , 24);
					t.restar(t2) ;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				break;
				
			}
			System.out.println();
		} while (continuar);

		sc.close();
	}

}
