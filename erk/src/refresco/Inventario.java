package refresco;

import java.util.Arrays;

public class Inventario {
	private Bebida[] bebidas = new Bebida[0];
	private int indice;
	public Inventario(int bebidas, int indice) {
		
		this.bebidas = new Bebida[bebidas];
		this.indice = 0;
	}
	
	@Override
	public String toString() {
		return "Inventario [bebidas=" + Arrays.toString(bebidas) + ", indice=" + indice + "]";
	}
	
	
}
