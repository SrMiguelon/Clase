package objetos;

import java.util.Scanner;

public class AplicacionTv {

	public static void main(String[] args) {
		Televisor tele1 = new Televisor(5);
		Scanner sc = new Scanner(System.in);
		boolean salir = true;
		while (salir) {
			switch (sc.nextInt()) {
			case 1:
				tele1.subirCanal();
				break;
			case 2:
				tele1.bajarCanal();
				break;
			case 3:
				System.out.println("canal: " + tele1.getCanal());
				break;
			default:
				salir = false;
			}
		}

	}
}
