package ejnota;

import java.util.Scanner;

public class Ej14_CyB {

	public static void fibonacci(int num) {

	
		int resultado = 0;
		int anterior = 0;
		int primero = 1;
		System.out.print(anterior + " ");
		System.out.print(primero + " ");
		boolean seguir=true;

		while (resultado < num) {

			resultado = anterior + primero;
			System.out.print(resultado + " ");

			anterior = primero;
			primero = resultado;
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("mete un numero");
		fibonacci(sc.nextInt());
	}

}
