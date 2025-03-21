package ejercicioss;

import java.util.Scanner;

public class Ej3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
		int n = scanner.nextInt();

		// si es menor de 0 termina
		if (n < 0) {
			System.out.println("error");
			System.exit(0);
		}
		
		// operacion
		n = n * (n + 1) / 2;
	
		System.out.println(n);
		
		scanner.close();
	}
}
