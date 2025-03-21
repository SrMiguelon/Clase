package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Producto {
	String nombre;
	double precio;
	int cantidad;
	boolean enStock;

	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.enStock = cantidad > 0; // Determina si el producto está en stock
	}

	public String estadoProducto() {
		return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", cantidad=" + cantidad + ", enStock="
				+ enStock + '}';
	}
}

public class ProductoMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Producto[] productos = new Producto[3];
		
		for (int i = 0; i < productos.length; i++) {
			productos[i] = new Producto(sc.next(), sc.nextDouble(), random.nextInt(2));
		}
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i].enStock ==true) {
				System.out.println(productos[i].estadoProducto());
			}
			
		}
		
	}
}
