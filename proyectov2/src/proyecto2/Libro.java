package proyecto2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro {

	private String titulo;
	private static int contadorId = 0;
	private int idLibro;
	private String autor;
	private int categoria;
	private int anyoPublicacion;
	private boolean disponible;
	private LocalDate fechaLimiteDevolucion;
	private ArrayList<Usuario> listaReservas = new ArrayList<>(0);

	public Libro(String titulo, String autor, int categoria, int anyoPublicacion) {
		this.titulo = titulo;
		this.idLibro = ++contadorId;
		this.autor = autor;
		this.categoria = categoria;
		this.anyoPublicacion = anyoPublicacion;
		this.disponible=true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIdTitulo() {
		return idLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public LocalDate getFechaLimiteDevolucion() {
		return fechaLimiteDevolucion;
	}

	public void setFechaLimiteDevolucion(LocalDate fechaLimiteDevolucion) {
		this.fechaLimiteDevolucion = fechaLimiteDevolucion;
	}

	public ArrayList<Usuario> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(ArrayList<Usuario> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public int getIdLibro() {
		return idLibro;
	}


	public void mostrarInformacion() {
		System.out.println("Nombre: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Año de publicacion: " + getAnyoPublicacion());
		if (disponible) {
			System.out.println("Estado: Disponible");
		} else {
			System.out.println("Estado: Prestado");
			System.out.println("Fecha de devolucion: " + getFechaLimiteDevolucion());
			if (!getListaReservas().isEmpty()) {
				System.out.println("Lista de usuarios que han reservado este libro: ");
				for (Usuario usuario : listaReservas) {
					System.out.println(usuario + " tiene reservado este libro");
				}

			}

		}
	}
}
