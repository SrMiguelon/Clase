package act3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_tiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int horas, minutos, segundos;
		ArrayList<Tiempo> tiempos = new ArrayList<>(0);
		Tiempo t1 = null;
		boolean salir =false;
		while(!salir) {
			System.out.println("0) Salir del programa");
			System.out.println("1) Leer por teclado un tiempo válido");
			System.out.println("2) Visualizar en consola el tiempo");
			System.out.println("3) Sumar al tiempo otro tiempo");
			System.out.println("4) Restar al tiempo otro tiempo");
		switch (sc.nextInt()) {
		case 0:
			break;
		case 1:
			boolean bien = false;
			while (!bien) {
				System.out.println("escribe horas");
				horas = sc.nextInt();
				System.out.println("escribe minutos");
				minutos = sc.nextInt();
				System.out.println("escribe segundos");
				segundos = sc.nextInt();
				if ((horas <= 23 && horas >= 0) && (minutos <= 59 && minutos >= 0)
						&& (segundos <= 59 && segundos >= 0)) {

					t1 = new Tiempo(horas, minutos, segundos);
					tiempos.add(t1);
					System.out.println("Se ha creado un tiempo válido.");
					bien = true;

				} else {

					System.out.println("algunos de los parametros esta mal, vuelve a intentarlo");

				}
			}
			break;
		case 2:
			if (tiempos.indexOf(t1)==-1) {
				System.out.println("No existe ningún tiempo válido creado.");
			}
			break;

		} }
	}

}
