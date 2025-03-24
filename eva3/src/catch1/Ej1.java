package catch1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		try {
			num1 = entrada.nextInt();
			num2 = 5;
			System.out.println(num2 / num1);
		} catch (java.lang.ArithmeticException e1) {
			// TODO: handle exception
			System.out.println("no metas un 0");
		} catch (java.util.InputMismatchException e2) {
			// TODO: handle exception
			System.out.println("mete un digito");
		}
	}
}
