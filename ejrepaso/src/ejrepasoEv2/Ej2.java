package ejrepasoEv2;

public class Ej2 {
	
	public static int numerosNegativos(int[] cadenaNum) {
		int contador=0;
		
		for (int i : cadenaNum) {
			if (i<0) {
				contador++;
				
			}
		}
		return contador;
		
	}
	
	public static void main(String[] args) {
		int[] numeros = { -1, 5, -8, 6, -9 };
		System.out.println("hay " + numerosNegativos(numeros) + " numeros negativos");
	}
}
