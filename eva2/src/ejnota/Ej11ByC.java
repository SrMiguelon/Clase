package ejnota;

import java.util.Scanner;

public class Ej11ByC {
	public static boolean añoBisiesto(int año) {
		if (año % 4 == 0 && año %100 ==1 || año%400==0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año para saber si es bisiesto");
		System.out.println(añoBisiesto(sc.nextInt()));
	}
}
