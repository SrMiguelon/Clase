package sgb;
import java.time.LocalDate;
import java.util.ArrayList;

public class Libro {
    private String titulo;
    private int idLibro;
    private String autor;
    private int categoria;
    private int anyoPublicacion;
    private boolean disponible;
    private LocalDate fechaLimiteDevolucion;
    private ArrayList<Usuario> listaReservas;

    private static int contadorLibros = 0;

    public Libro(String titulo, String autor, int categoria, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anyoPublicacion = anyoPublicacion;
        this.disponible = true;
        this.listaReservas = new ArrayList<>();
        this.idLibro = ++contadorLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public LocalDate getFechaLimiteDevolucion() {
        return fechaLimiteDevolucion;
    }

    public ArrayList<Usuario> getListaReservas() {
        return listaReservas;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setFechaLimiteDevolucion(LocalDate fechaLimiteDevolucion) {
        this.fechaLimiteDevolucion = fechaLimiteDevolucion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Año de publicación: " + anyoPublicacion);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        if (!disponible) {
            System.out.println("Fecha de devolución: " + fechaLimiteDevolucion);
        }
        if (!listaReservas.isEmpty()) {
            System.out.println("Lista de usuarios que han reservado este libro:");
            for (Usuario usuario : listaReservas) {
                System.out.println("- " + usuario.getNombre() + " tiene reservado este libro.");
            }
        }
    }
}