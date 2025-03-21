package ejPelicula;

public class Principal {
	public static void mostrarInformacion(Pelicula peli) {
		System.out.println(peli.getTitulo());
		System.out.println(peli.getMinutosDuracion());
		System.out.println(peli.isDobladaCastellano());
		System.out.println(peli.getPuntuacion());
		System.out.println(Pelicula.getPelisVistas());
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Pelicula peli1 = new Pelicula("El Hoyo", 88, true, 7.5);
		mostrarInformacion(peli1);
		Pelicula peli2 = new Pelicula("El padrino", 175, true, 10);
		mostrarInformacion(peli2);
	}

}
