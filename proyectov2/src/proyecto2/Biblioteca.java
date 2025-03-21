package proyecto2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	private ArrayList<Usuario> usuarios;

	public Biblioteca() {

		this.libros = new ArrayList<Libro>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public void agregarLibro(Libro libro) {

		if (!libros.contains(libro)) {
			libros.add(libro);
		} else {
			System.out.println("ya existe");
		}

	}

	public void registrarUsuario(Usuario usuario) {
		if (!usuarios.contains(usuario)) {
			usuarios.add(usuario);
		} else {
			System.out.println("ya existe");
		}
	}

	public void prestarLibro(int idUsuario, int idLibro) {
		for (Usuario usuario : usuarios) {
			for (Libro libro : libros) {
				if (libro.getIdLibro() == idLibro && usuario.getId() == idUsuario) {
					if (libro.isDisponible() && usuario.getLibrosPrestados().size() < 3
							&& !usuario.isRetrasoDevolucion()) {
						libro.setFechaLimiteDevolucion(LocalDate.now().plusMonths(1));
						libro.setDisponible(false);
						usuario.getLibrosPrestados().add(libro);
						usuario.actualizaLibrosPendientes();
						System.out.println("Libro prestado con éxito.");
					}
					else {
						
						reservarLibro(idUsuario, idLibro);
					}

				}

			}

		}

	}

	public void devolverLibro(int idUsuario, int idLibro) {
		for (Libro libro : libros) {
			for (Usuario usuario : usuarios) {
				if (libro.getIdLibro() == idLibro && usuario.getId() == idUsuario) {
					usuario.getLibrosPrestados().remove(libro);
					usuario.actualizaLibrosPendientes();
					System.out.println("libro devuelto con exito");
					if (!libro.getListaReservas().isEmpty()) {
						libro.getListaReservas().get(0).getLibrosPrestados().add(libro);
						libro.getListaReservas().remove(0);
						System.out.println("libro prestado con exito");
						
					}
				}
			}
		}
	}

	public void reservarLibro(int idUsuario, int idLibro) {

		for (Usuario usuario : usuarios) {
			for (Libro libro : libros) {
				if (libro.getIdLibro() == idLibro && usuario.getId() == idUsuario && !libro.isDisponible()) {
					System.out.println("el libro "+ libro.getTitulo() + " se ha reservado a " + usuario.getNombre() );
					libro.setFechaLimiteDevolucion(libro.getFechaLimiteDevolucion().plusMonths(1));
					libro.getListaReservas().add(usuario);
					usuario.actualizaLibrosPendientes();

				}
			}
		}
	}

	public ArrayList<Libro> ordenarLibrosTitulo() {
		for (int i = 0; i < libros.size() - 1; i++) {
			for (int j = 0; j < libros.size() - i - 1; j++) {
				if (libros.get(j).getTitulo().compareToIgnoreCase(libros.get(j + 1).getTitulo()) > 0) {
					Libro temp = libros.get(j);
					libros.set(j, libros.get(j + 1));
					libros.set(j + 1, temp);
				}
			}
		}
		return libros;
	}

	public ArrayList<Libro> ordenarLibrosAutor() {
		for (int i = 0; i < libros.size() - 1; i++) {
			for (int j = 0; j < libros.size() - i - 1; j++) {
				if (libros.get(j).getAutor().compareToIgnoreCase(libros.get(j + 1).getAutor()) > 0) {
					Libro temp = libros.get(j);
					libros.set(j, libros.get(j + 1));
					libros.set(j + 1, temp);
				}
			}
		}
		return libros;
	}

	public ArrayList<Libro> ordenarLibrosFecha() {
		for (int i = 0; i < libros.size() - 1; i++) {
			for (int j = 0; j < libros.size() - i - 1; j++) {
				if (libros.get(j).getAnyoPublicacion() > libros.get(j + 1).getAnyoPublicacion()) {
					Libro temp = libros.get(j);
					libros.set(j, libros.get(j + 1));
					libros.set(j + 1, temp);
				}
			}
		}
		return libros;
	}

	public void mostrarLibrosPrestados() {
		for (Libro libro : libros) {
			for (Usuario usuario : usuarios) {
				if (usuario.getLibrosPrestados().contains(libro)) {
					System.out.println("El libro " + libro.getTitulo() + " lo tiene el usuario " + usuario.getNombre());
				}
			}
		}
	}

	public void mostrarLibrosDisponibles() {

		for (Libro libro : libros) {
			if (libro.isDisponible()) {
				System.out.println("El libro " + libro.getTitulo() + " esta disponible en la biblioteca");
			}
			

		}
	}

	public void mostrarReservasLibro(int idLibro) {
		for (Libro libro : libros) {
			if (libro.getIdLibro() == idLibro) {
				System.out.println("El libro " + libro.getTitulo() + " esta reservado por los siguientes usuarios: ");
				for (Usuario usuario : libro.getListaReservas()) {
					System.out.println(usuario.getNombre());
				}
			}
		}
	}
	public void mostrarLibrosCategoria(int categoria) {
		System.out.println("La categoría "+ categoria +" cuenta con los siguientes libros:");
		for (Libro libro : libros) {
			if (libro.getCategoria() == categoria) {
				System.out.println(libro.getTitulo());
				
			}
		}
	}
	
	

}
