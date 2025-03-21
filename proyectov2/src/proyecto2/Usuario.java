package proyecto2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	Scanner sc = new Scanner(System.in);
	private static int contadorId = 0;
	private String nombre;
	private int id;
	private boolean retrasoDevolucion;
	private ArrayList<Libro> librosPrestados = new ArrayList<>(0);

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.id = ++contadorId;
		this.retrasoDevolucion=false;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public boolean isRetrasoDevolucion() {
		return retrasoDevolucion;
	}

	public void setRetrasoDevolucion(boolean retrasoDevolucion) {
		this.retrasoDevolucion = retrasoDevolucion;
	}

	public ArrayList<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}

	public void actualizaLibrosPendientes() {
		for (Libro libro : librosPrestados) {
			if (libro.getFechaLimiteDevolucion().isBefore(LocalDate.now())) {
				this.retrasoDevolucion=true;
			}
			else {
				this.retrasoDevolucion=false;
			}
		}
		

		
	}

	public void mostrarInformacion() {
		if (retrasoDevolucion) {
			System.out.println("Nombre: " + getNombre());
			System.out.println("ID: " + getId());
			System.out.println("Libros prestados:");
			for (Libro libro : librosPrestados) {
				System.out.println(libro+"");
			}
			System.out.println("Libros con devolucion retrasada:");
			
		} else {
			System.out.println("Nombre: " + getNombre());
			System.out.println("ID: " + getId());
			System.out.println("Libros prestados:");
			
		}
	}
}
