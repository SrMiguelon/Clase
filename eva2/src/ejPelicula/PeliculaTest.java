package ejPelicula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeliculaTest {

	@Test
	void test() {
		Pelicula p1 = new Pelicula("Rambo", 60, true);
		
		System.out.println(p1.getTitulo());
		p1.getPelisVistas();
	}

}
