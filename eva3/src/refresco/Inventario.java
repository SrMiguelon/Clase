package refresco;

import java.awt.print.PageFormat;
import java.util.Arrays;

public class Inventario {
	private Bebida[] bebidas = new Bebida[0];
	private int indice;

	public Inventario(int bebidas) {

		this.bebidas = new Bebida[bebidas];
		this.indice = 0;
	}

	@Override
	public String toString() {
		for (int i = 0; i < bebidas.length; i++) {
			System.out.println("Inventario [bebidas=" + Arrays.toString(bebidas) + " posicion : " + i + ", indice="
					+ indice + "]");
			;
		}
		return null;

	}

}
