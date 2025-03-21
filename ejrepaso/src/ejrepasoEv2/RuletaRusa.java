package ejrepasoEv2;

import java.util.Random;

public class RuletaRusa {

	private int posicionActual;
	private int posicionBala;

	public RuletaRusa() {
		Random random = new Random();
		this.posicionActual = 1;
		this.posicionBala = random.nextInt(6) + 1;
	}

	public boolean disparar() {
		if (posicionActual == posicionBala) {
			return true;
		} else {
			return false;
		}
	}

	public void siguienteBala() {
		this.posicionActual++;
	}

	public String toString() {

		return "la posicion actual es: " + posicionActual + " y la posicion de la bala es: " + posicionBala;

	}
}
