package sgb;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private int id;
    private boolean retrasoDevolucion;
    private ArrayList<Libro> librosPrestados;

    private static int contadorUsuarios = 0;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        this.retrasoDevolucion = false;
        this.id = ++contadorUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public boolean isRetrasoDevolucion() {
        return retrasoDevolucion;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void actualizaLibrosPendientes() {
    	this.retrasoDevolucion = false;		
		
		// metodo comprobar libros pendientes true o false
		// un metodo deberia hacer una cosa concreta
		
		if (this.librosPrestados.isEmpty()) {			
			return; // si esta vacio, termino el metodo
		}
		
		LocalDate fechaActual = LocalDate.now(); // obtener la fecha actual en el momento de la comprobacion
		for (Libro miLibro : this.librosPrestados) {
			if(miLibro.getFechaLimiteDevolucion().isBefore(fechaActual)) { // si es el mismo dia no lo comprueba
				this.retrasoDevolucion = true;
				break; // con solo ver si tengo uno ya se que hay pendientes
			}
		}
    }

    public void mostrarInformacion() {
        actualizaLibrosPendientes();
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Libros prestados:");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo() + ": hasta el " + libro.getFechaLimiteDevolucion());
        }
        if (retrasoDevolucion) {
            System.out.println("Libros con devolución retrasada:");
            for (Libro libro : librosPrestados) {
                System.out.println("- " + libro.getTitulo() + ": hasta el " + libro.getFechaLimiteDevolucion());
            }
        }
    }
}
