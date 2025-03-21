package ej_bucles_y_condicionales;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a<=10;a++) {
			System.out.println("TABLA DEL " + a);
			for (int b=0; b<=10;b++) {
				int resultado = b*a;
				System.out.println(a + "*" + b+ "=" + resultado);
			}
		}
	}

}
