package ejSem3;

public class Ej2 {
	public static String invertirString(String cadena) {

		String invertida = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		return invertida;

	}

	public static String ejercicio5(int entero) {

		String binario = "";
		while (entero > 1) {
			if (entero % 2 == 1) {
				binario += "1";
			} else if (entero % 2 == 0) {
				binario += "0";
			}
			entero /= 2;
		}
		if (entero == 1) {
			binario += "1";
		} else if (entero == 0) {
			binario += "0";
		}
		
		binario = invertirString(binario);

		return binario;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ejercicio5(23519));
	}

}
