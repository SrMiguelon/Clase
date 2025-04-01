package sgb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
	Scanner sc = new Scanner(System.in);
	private final ArrayList<Libro> libros;
	private final ArrayList<Usuario> usuarios;

	public Biblioteca() {
		this.libros = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void registrarUsuario(Usuario usuario) {
		if (!usuarios.contains(usuario)) {
			usuarios.add(usuario);
		}
	}

	public void prestarLibro(int idUsuario, int idLibro) {
		Usuario usuario = encontrarUsuarioPorId(idUsuario);
		Libro libro = encontrarLibroPorId(idLibro);

		usuario.actualizaLibrosPendientes();

		if (usuario != null && libro != null) {
			if (libro.isDisponible() && usuario.getLibrosPrestados().size() < 3 && !usuario.isRetrasoDevolucion()) {
				libro.setDisponible(false);
				libro.setFechaLimiteDevolucion(LocalDate.now().plusMonths(1));
				usuario.getLibrosPrestados().add(libro);
				System.out.println("Libro prestado con éxito.");
			} else if (!libro.isDisponible() && usuario.getLibrosPrestados().size() < 3
					&& !usuario.isRetrasoDevolucion()) {
				libro.getListaReservas().add(usuario);
				System.out.println("No se puede prestar el libro " + libro.getTitulo() + ". Ya está prestado.");
			} else {
				System.out.println("No se puede prestar el libro.");
			}
		} else {
			System.out.println("Usuario o libro no encontrado.");
		}
	}

	public void devolverLibro(int idUsuario, int idLibro) {
		Usuario usuario = encontrarUsuarioPorId(idUsuario);
		Libro libro = encontrarLibroPorId(idLibro);

		if (usuario != null && libro != null) {
			if (usuario.getLibrosPrestados().contains(libro)) {
				libro.setDisponible(true);
				usuario.getLibrosPrestados().remove(libro);
				System.out.println("Libro devuelto con éxito.");
				if (!libro.getListaReservas().isEmpty()) {
					Usuario siguienteUsuario = libro.getListaReservas().remove(0);
					prestarLibro(siguienteUsuario.getId(), libro.getIdLibro());
				}
			} else {
				System.out.println("El usuario no tiene este libro prestado.");
			}
		} else {
			System.out.println("Usuario o libro no encontrado.");
		}
	}

	public ArrayList<Libro> ordenarLibrosTitulo() {
		ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
		for (int i = 0; i < librosOrdenados.size() - 1; i++) {
			for (int j = 0; j < librosOrdenados.size() - i - 1; j++) {
				if (librosOrdenados.get(j).getTitulo()
						.compareToIgnoreCase(librosOrdenados.get(j + 1).getTitulo()) > 0) {
					Libro temp = librosOrdenados.get(j);
					librosOrdenados.set(j, librosOrdenados.get(j + 1));
					librosOrdenados.set(j + 1, temp);
				}
			}
		}
		return librosOrdenados;
	}

	public ArrayList<Libro> ordenarLibrosAutor() {
		ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
		for (int i = 0; i < librosOrdenados.size() - 1; i++) {
			for (int j = 0; j < librosOrdenados.size() - i - 1; j++) {
				if (librosOrdenados.get(j).getAutor().compareToIgnoreCase(librosOrdenados.get(j + 1).getAutor()) > 0) {
					Libro temp = librosOrdenados.get(j);
					librosOrdenados.set(j, librosOrdenados.get(j + 1));
					librosOrdenados.set(j + 1, temp);
				}
			}
		}
		return librosOrdenados;
	}

	public ArrayList<Libro> ordenarLibrosFecha() {
		ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
		for (int i = 0; i < librosOrdenados.size() - 1; i++) {
			for (int j = 0; j < librosOrdenados.size() - i - 1; j++) {
				if (librosOrdenados.get(j).getAnyoPublicacion() > librosOrdenados.get(j + 1).getAnyoPublicacion()) {
					Libro temp = librosOrdenados.get(j);
					librosOrdenados.set(j, librosOrdenados.get(j + 1));
					librosOrdenados.set(j + 1, temp);
				}
			}
		}
		return librosOrdenados;
	}

	public void mostrarLibrosPrestados() {
		for (Libro libro : libros) {
			if (!libro.isDisponible()) {
				for (Usuario usuario : usuarios) {
					if (usuario.getLibrosPrestados().contains(libro)) {
						System.out.println(
								"El libro " + libro.getTitulo() + " lo tiene el usuario " + usuario.getNombre());
					}
				}
			}
		}
	}

	public void mostrarLibrosDisponibles() {
		for (Libro libro : libros) {
			if (libro.isDisponible()) {
				System.out.println("El libro " + libro.getTitulo() + " está disponible en la biblioteca.");
			}
		}
	}

	public void mostrarReservasLibro(int idLibro) {
		Libro libro = encontrarLibroPorId(idLibro);
		if (libro != null) {
			System.out.println("El libro " + libro.getTitulo() + " está reservado por los siguientes usuarios:");
			for (Usuario usuario : libro.getListaReservas()) {
				System.out.println(usuario.getNombre());
			}
		} else {
			System.out.println("Libro no encontrado.");
		}
	}

	public void mostrarLibrosCategoria(int categoria) {
		System.out.println("La categoría " + categoria + " cuenta con los siguientes libros:");
		for (Libro libro : libros) {
			if (libro.getCategoria() == categoria) {
				System.out.println(libro.getTitulo());
			}
		}
	}

	public void prorrogarFecha(int numDias) throws ExcepcionFechaErronea {
		Libro l = encontrarLibroPorId(1);

		if (numDias < 0 || numDias > 9999) {
			throw new ExcepcionFechaErronea("el año de publicación es superior a 4 dígitos o negativo.");
		} else {
			System.out.println("di el id del libro");
			Libro libro = encontrarLibroPorId(sc.nextInt());
			libro.setFechaLimiteDevolucion(libro.getFechaLimiteDevolucion().plusDays(numDias));
		}

	}

	private Usuario encontrarUsuarioPorId(int id) {
		for (Usuario usuario : usuarios) {
			if (usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}

	private Libro encontrarLibroPorId(int id) {
		for (Libro libro : libros) {
			if (libro.getIdLibro() == id) {
				return libro;
			}
		}
		return null;
	}

}