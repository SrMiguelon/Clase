package refresco;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public void rellenarBebidas() {
		Random random = new Random();
		switch (random.nextInt(4)) {
		case 1:
			String nombre = "";
			switch (random.nextInt(6)) {
			case 0:
				nombre = "Limonada";
				break;
			case 1:
				nombre = "cola";
				break;
			case 2:
				nombre = "gaseosa";
				break;
			case 3:
				nombre = "té helado";
				break;
			case 4:
				nombre = "granizado";
				break;
			case 5:
				nombre = "ponche.";
				break;
			default:
				break;
			}
			Refresco refresco = new Refresco(nombre, random.nextBoolean(), random.nextDouble(32) + 4);
			break;
		case 2:
			nombre = "";
			switch (random.nextInt(5)) {
			case 0:
				nombre = "sidra";
				break;
			case 1:
				nombre = "cerveza";
				break;
			case 4:
				nombre = "vino";
				break;
			case 5:
				nombre = "hidromiel";
				break;
			case 6:
				nombre = "sake";
				break;
			default:
				break;
			}
			BebidaFermentada bebidaFermentada = new BebidaFermentada(nombre, 0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Inventario inv = new Inventario(20);
		switch (sc.nextInt()) {
		case 1:

			break;

		default:
			break;
		}
	}

}
