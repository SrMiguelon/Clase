package act1;

public class Videojuego {
	private String nombre;
	private String desarrollador;
	private int año;
	private int numMaxJugadores;

	public Videojuego(String nombre, String desarrollador, int año, int numMaxJugadores) {
		super();
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.año = año;
		this.numMaxJugadores = numMaxJugadores;
	}

	public Videojuego(String nombre, String desarrollador, int año) {
		super();
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.año = año;
		this.numMaxJugadores = 1;
	}

	public Videojuego(String nombre, String desarrollador) {
		super();
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.año = 2021;
		this.numMaxJugadores = 1;
	}

	public String obtenerEstado() {

		return "nombre: " + nombre + " Desarrolador: " + desarrollador + " año: " + año
				+ " Numero maximo de jugadores: " + numMaxJugadores;
	}

}
