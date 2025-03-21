package ej_bucles_y_condicionales;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa un número natural: ");
		int numero = sc.nextInt();
		int numeroInvertido = 0;

		while (numero > 0) {
			// se saca el primer numero
			int digito = numero % 10;
			// se añada a una variable, cada vez que se va a sumar un digito se multiplica
			// por 10
			numeroInvertido = numeroInvertido * 10 + digito;
			System.out.println(numeroInvertido);
			// se quita el primer numero dividiendo para 10
			numero = numero / 10;
		}
		sc.close();
		System.out.println("Número invertido: " + numeroInvertido);

	}

}
