package proyecto;

import java.util.Scanner;

public class Proyecto {
	public static void menu() {
		System.out.println("Bienvenido a la biblioteca de juegos de playtaca");
		System.out.println("opcion 1: Adivina el numero");
		System.out.println("opcion 2: Piedra, papel o tijera");
		System.out.println("opcion 3: Ruleta rusa");
	}

	public static int aleatorio(Scanner sc) {
		int random = (int) (Math.random() * 100) + 1;
		int fallo = 0;
		boolean acierto = false;

		while (acierto == false) {

			int num = sc.nextInt();

			if (num < random) {

				System.out.println("El numero introducido es menor");
				System.out.println("Introduce una nueva opcion");

			} else if (num > random) {

				System.out.println("El numero introducido es mayor");
				System.out.println("Introduce una nueva opcion");

			} else {
				System.out.println("Felicidades, has acertado");
				acierto = true;
			}
			fallo++;
		}
		return fallo;
	}

	public static String ppt(Scanner sc) {
		int marcadorc = 0;
		int marcadoru = 0;
		String computadora = "";
		boolean victoria = false;
		while (victoria == false) {

			System.out.println("elige una opcion");
			String respuesta = sc.next();
			int random = (int) (Math.random() * 3) + 1;
			System.out.println(random);
			switch (random) {
			case 1:
				computadora = "tijera";
				break;
			case 2:
				computadora = "papel";
				break;
			case 3:
				computadora = "piedra";
				break;
			}
			if ((respuesta.equals("papel") && computadora.equals("piedra"))
					|| (respuesta.equals("tijera") && computadora.equals("papel"))
					|| (respuesta.equals("piedra") && computadora.equals("tijera"))) {
				System.out.println("has ganado");
				marcadoru++;
			} else if ((respuesta.equals("tijera") && computadora.equals("piedra"))
					|| (respuesta.equals("piedra") && computadora.equals("papel"))
					|| (respuesta.equals("papel") && computadora.equals("tijera"))) {
				System.out.println("has perdido");
				marcadorc++;
			} else if ((respuesta.equals("papel") && computadora.equals("papel"))
					|| (respuesta.equals("tijera") && computadora.equals("tijera"))
					|| (respuesta.equals("piedra") && computadora.equals("piedra"))) {
				System.out.println("empate");
			} else {
				System.out.println("incorrecto");
			}
			System.out.println("Marcador");
			System.out.println("usuario: " + marcadoru + " computadora: " + marcadorc);
			if (marcadoru == 2 || marcadorc == 2) {
				victoria = true;
			}
		}
		if (marcadoru == 2) {
			return "ha ganado el usuario";
		} else {
			return "ha ganado la computadora";
		}
	}

	public static String ruletar(Scanner sc) {
		int usuario;
		int maquina;

		int revolverm = 0;
		int revolveru = 0;

		int balam = (int) (Math.random() * 8) + 1;
		int balau = (int) (Math.random() * 8) + 1;

		int moneda_num = (int) (Math.random() * 2) + 1;

		boolean disparo = false;

		int ronda = 1;

		
		String moneda = sc.next();

		if (moneda.equals("cara")) {
			switch (moneda_num) {
			case 1:
				System.out.println("ha salido cara");
				usuario = 0;
				maquina = 1;
				break;
			case 2:
				System.out.println("ha salido cruz");
				usuario = 1;
				maquina = 0;
				break;
			}

		} else if (moneda.equals("cruz")) {
			switch (moneda_num) {
			case 1:
				System.out.println("ha salido cara");
				usuario = 1;
				maquina = 0;
				break;
			case 2:
				System.out.println("ha salido cruz");
				usuario = 0;
				maquina = 1;
				break;
			}
		} else {
			System.exit(0);
		}

		while (!disparo) {

			System.out.println("roda: " + ronda);
			ronda++;
			if (!disparo) {
				if (revolverm == balam) {
					disparo = true;
					return "la maquina a muerto";
				} else {
					revolverm++;
					System.out.println("no ha pasado nada");
				}
			}

			if (!disparo) {
				if (revolveru == balau) {
					disparo = true;
					return "el usuario a muerto";
				} else {
					revolveru++;
					System.out.println("no ha pasado nada");
				}
			}
		}
		return "";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seguir = false;
		while (!seguir) {

			menu();
			int opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("inserta un numero del 1 al 100, por cada fallo ira diciendo si es mayor o menor");
				int fallos = aleatorio(sc);
				System.out.println("has fallado " + fallos + " veces");
				break;
			case 2:
				System.out.println("Piedra papel o tijeras. Elige tu opcion escribiendo");
				String resultado = ppt(sc);
				System.out.println(resultado);
				break;
			case 3:
				System.out.println("Ruleta rusa. Elije cara o cruz para tirar la moneda, quien falle, empieza.");
				String muerte = ruletar(sc);
				System.out.println(muerte);
				break;

			default:
				seguir = true;
			}

		}
	}
}
