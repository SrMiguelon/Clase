package evaluacionuno;

import java.util.Scanner;

public class MainEvaUno {

	public static void main(String[] args) {
		
		/* Se pide que implementes las funciones que están fuera del main 
		 * atendiendo a su enunciado concreto.
		 * 
		 * Importa las clases mínimas que necesites
		 * 
		 * Sólo puedes escribir dentro del cuerpo de las funciones correspondientes a
		 * cada ejercicio.
		 * 
		 * Se ejecutará el main para comprobar el funcionamiento correcto de cada función.
		 * 
		 */
		//EN EL MAIN NO PUEDES ESCRIBIR
		menores();
		//numeroSecreto();
		numerosEnterosComprendidos();
		numerosAleatorios();
		//diferenciaMinutos(12,30,2,55);
		//diferenciaMinutos(1,30,2,55);
	

		//funcionParaQuePruebesTusFunciones();
	}
	
	static void funcionParaQuePruebesTusFunciones() {
		//Si necesitas probar tus funciones implementa aquí lo que quieras
		
	}
	
	static void menores() {
		/* EJERCICIO 1 (2 PUNTO)
		 * Implementa la función para que devuelva por consola todos 
		 * los múltiplos de 7 menores de 1000.
		 */
		
	
		System.out.println("INICIO MENORES " );
		
		
		for ( int i = 7; i < 1000; i +=7) {
			System.out.println(i);
		}
		
				
		System.out.println("FIN MENORES\n" );
	}
	
	
	 
	
	static void numeroSecreto() {
		 /* EJERCICIO 2 (2 PUNTOS)
		 * 
		 * Implementa esta función para que recree el juego "número secreto",
		 * que consiste en acertar un número entre 0 y 100 (generado aleatoriamente). 
		 * 
		 * Para ello se van introduciendo por teclado una serie de números (de uno en uno)
		 * para los que el programa nos da la pista si el número a acertar es mayor o menor.
		 * 
		 * El proceso termina cuando el usuario acierta el número (debe indicarse que el
		 * número ha sido acertado y el número total de intentos realizados)o cuando se 
		 * rinde (introduciendo un -1 para rendirse y mostrando el número de intentos realizados).
		 */
		 System.out.println("INICIO NUMEROSECRETO");
		 Scanner entrada = new Scanner (System.in);

		 System.out.println("Introduce un número del 0 al 100");
		 
		 int aleatorio = (int)(Math.random()*100)+1;
		 int contador = 0;
		 int numero = entrada.nextInt();
		 for (int k = 0; k < aleatorio ; k++) {
			 
			
			 while (numero != aleatorio || numero == -1) {
		
				 contador++;
				 if (numero > aleatorio || numero == -1) {
					 System.out.println("El número es menor");
				 } else if (numero < aleatorio) {
					 System.out.println("El número es mayor");
				 } else if (numero == aleatorio){
					 System.out.println("Has acertado");
				 } else {
					

				 }
			 }
		 }
		 
		 
		 
		 System.out.println("FIN NUMEROSECRETO\n");
	 }
	

	 
	
	static void numerosEnterosComprendidos() {
		 /* EJERCICIO 3 (2PUNTOS)
		  * Escribe un programa que obtenga números enteros comprendidos entre 
		  * dos números introducidos por teclado y validados como distintos, el programa 
		  * debe empezar por el menor de los enteros introducidos e ir incrementando de 8 en 8.
		  */
		 System.out.println("INICIO NUMEROSENTEROSCOMPRENDIDOS");
		
		 Scanner entrada = new Scanner (System.in);
		 System.out.print("Introduce el primer número: ");
		 
		 int numero1 = entrada.nextInt();
		 
		 System.out.print("Introduce el segundo número: ");
		 
		 int numero2 = entrada.nextInt();
		 
		 if (numero1 == numero2) {
			 System.out.println("No se puede poner el mismo número"+ "\n");
			 System.out.print("Introduce el primer número: ");
			 numero1 = entrada.nextInt();	 
			 System.out.print("Introduce el segundo número: "); 
			 numero2 = entrada.nextInt();
		 }
		 if (numero2 < numero1) {
			 
			 for (int k = numero2; numero2 < numero1 ; numero2 += 8)
				 System.out.println(numero2);
			 
		 } else  {
			 
			 for ( int i = numero1 ; numero1 < numero2 ; numero1 += 8) {
				 System.out.println(numero1);
			 } 
		 }

		


		 
		 
		 System.out.println("FIN NUMEROSENTEROSCOMPRENDIDOS\n");
	 }
	 
	 
	
	
	static void numerosAleatorios() {
		 /* EJERCICIO 4 (2 PUNTOS)
		  * Muestra 20 números enteros aleatorios entre -100 y 100 (el primero incluido) separados por espacios.
		  */
		 System.out.println("INICIO NUMEROSALEATORIOS");
		 
		 for (int i = 0 ; i < 20 ; i++) {
			 int numeros = (int)(Math.random()*201)-100;
			 System.out.println(""+ numeros + "");
		 }
		 
		 System.out.println("FIN NUMEROSALEATORIOS\n");
	 }
	 
	 
	 
	
	
	static void diferenciaMinutos(int hora1, int minuto1, int hora2, int minuto2) {
		 /* EJERCICIO 5 (2 PUNTO)
		  * Diseña la función a la que se le pasan las horas y minutos de dos instantes de tiempo.
		  * La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes.
		  */
		 System.out.println("INICIO DIFERENCIAMINUTOS");
		 
		 		 
		 
		 System.out.println("FIN DIFERENCIAMINUTOS\n");
		}
}






























