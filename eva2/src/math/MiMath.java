package math;

public class MiMath {
	private static final double pi = 3.14159;

	public int potencia(int base, int exponente) {
		int potencia = 0;
		for (int i = 0; i <= exponente; i++) {
			potencia *= base;
		}
		return potencia;

	}

	public double areaCirculo(double radio) {

		return pi * (radio * radio);

	}

	public boolean esPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
	public boolean esPrimo(int numero) {
		for (int i = 2; i <numero/2; i++) {
			if (numero%i==0) {
				return false;
			}
		}
		return true;
	}
}
