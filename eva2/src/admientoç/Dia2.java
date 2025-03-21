package admientoç;



public class Dia2 {

	public static int[] castString(String lineas) {
		String[] lineaDividida = lineas.split(" ");
		int[] numeros = new int[lineaDividida.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(lineaDividida[i]);
		}
		return numeros;
	}
	

	private static boolean esSeguro(int[] num) {
		boolean bien = true;
		boolean esCreciente = num[0] < num[1];
		for (int i = 0; i < num.length - 1; i++) {

			if (Math.abs(num[i] - num[i + 1]) > 3||num[i] == num[i + 1]) {

				return false;
			}
			if (esCreciente) {
				if (num[i] <= num[i + 1]) {

				} else {
					return false;
				}
			} else {
				if (num[i] >= num[i + 1]) {

				} else {
					return false;
				}
			}
		}

		return bien;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reportesSeguros = 0;
		String[] reportes = AyudaAOC.leerArchivo("resources/" + args[0]);
	
		for (int i = 0; i < reportes.length; i++) {
			if (esSeguro(castString(reportes[i]))) {
				reportesSeguros++;
			}
		}
		System.out.println("Hay " + reportesSeguros + " reportes seguros");
	}

}
