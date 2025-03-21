package proyecto2;


import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
        // Crear una instancia de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("Romancero gitano", "Federico García Lorca", 861, 1928);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 863, 1967);
        Libro libro3 = new Libro("La casa de los espíritus", "Isabel Allende", 863, 1982);
        Libro libro4 = new Libro("1984", "George Orwell", 823, 1949);

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan Pérez García");
        Usuario usuario2 = new Usuario("Marta López");
        Usuario usuario3 = new Usuario("Carlos Sánchez");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        // Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        biblioteca.registrarUsuario(usuario3);
      

        // Mostrar libros disponibles
        System.out.println("=== Libros disponibles ===");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println();

        // Prestar libros a usuarios
        System.out.println("=== Prestar libros ===");
        biblioteca.prestarLibro(usuario1.getId(), libro1.getIdLibro()); // Juan presta "Romancero gitano"
        biblioteca.prestarLibro(usuario2.getId(), libro2.getIdLibro()); // Marta presta "Cien años de soledad"
        biblioteca.prestarLibro(usuario3.getId(), libro3.getIdLibro()); // Carlos presta "La casa de los espíritus"
        System.out.println();

        // Mostrar libros prestados
        System.out.println("=== Libros prestados ===");
        biblioteca.mostrarLibrosPrestados();
        System.out.println();

        // Intentar prestar un libro ya prestado
        System.out.println("=== Intentar prestar un libro ya prestado ===");
        biblioteca.prestarLibro(usuario1.getId(), libro2.getIdLibro()); // Juan intenta prestar "Cien años de soledad"
        System.out.println();

        // Mostrar reservas de un libro
        System.out.println("=== Reservas del libro 'Cien años de soledad' ===");
        biblioteca.mostrarReservasLibro(libro2.getIdLibro());
        System.out.println();

        // Devolver un libro
        System.out.println("=== Devolver un libro ===");
        biblioteca.devolverLibro(usuario2.getId(), libro2.getIdLibro()); // Marta devuelve "Cien años de soledad"
        System.out.println();

        // Mostrar libros prestados después de la devolución
        System.out.println("=== Libros prestados después de la devolución ===");
        biblioteca.mostrarLibrosPrestados();
        System.out.println();

        // Mostrar libros disponibles después de la devolución
        System.out.println("=== Libros disponibles después de la devolución ===");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println();

        // Ordenar libros por título
        System.out.println("=== Libros ordenados por título ===");
        ArrayList<Libro> librosOrdenadosTitulo = biblioteca.ordenarLibrosTitulo();
        for (Libro libro : librosOrdenadosTitulo) {
            System.out.println(libro.getTitulo());
        }
        System.out.println();

        // Ordenar libros por autor
        System.out.println("=== Libros ordenados por autor ===");
        ArrayList<Libro> librosOrdenadosAutor = biblioteca.ordenarLibrosAutor();
        for (Libro libro : librosOrdenadosAutor) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
        System.out.println();

        // Ordenar libros por fecha de publicación
        System.out.println("=== Libros ordenados por fecha de publicación ===");
        ArrayList<Libro> librosOrdenadosFecha = biblioteca.ordenarLibrosFecha();
        for (Libro libro : librosOrdenadosFecha) {
            System.out.println(libro.getTitulo() + " - " + libro.getAnyoPublicacion());
        }
        System.out.println();

        // Mostrar libros de una categoría específica
        System.out.println("=== Libros de la categoría 863 ===");
        biblioteca.mostrarLibrosCategoria(863);
        System.out.println();
	}
}