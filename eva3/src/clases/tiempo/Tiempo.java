package clases.tiempo;

public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;

	private final int SEGUNDOS_POR_MINUTO = 60;
	private final int SEGUNDOS_POR_HORA = 3600;
	private final int HORAS_POR_DIA = 24;

	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public static boolean validar(int horas, int minutos, int segundos) {
		return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60;
	}

	public String obtenerEstado() {
		return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	}

	private int tiempoASegundos() {
		return horas * SEGUNDOS_POR_HORA + minutos * SEGUNDOS_POR_MINUTO + segundos;
	}

	private void actualizarTiempo(int nuevoTiempoSegundos) {
		horas = nuevoTiempoSegundos / SEGUNDOS_POR_HORA;
		minutos = (nuevoTiempoSegundos % SEGUNDOS_POR_HORA) / SEGUNDOS_POR_MINUTO;
		segundos = nuevoTiempoSegundos % SEGUNDOS_POR_MINUTO;
	}

	public boolean sumar(Tiempo t) throws ExcepcionTiempoInvalido {
		// Pasamos ambos a segundos
		int tiempoSegundos = tiempoASegundos();
		int tiempoSegundosT = t.tiempoASegundos();
		int sumaTiemposSegundos = tiempoSegundos + tiempoSegundosT;
		if (sumaTiemposSegundos >= HORAS_POR_DIA * SEGUNDOS_POR_HORA) {
			throw new ExcepcionTiempoInvalido("esta mal");
		} else {
			// Actualizamos nuestro tiempo para los segundos resultantes
			// de la suma
			actualizarTiempo(sumaTiemposSegundos);
			return true;
		}
	}

	public boolean restar(Tiempo t) throws ExcepcionTiempoInvalido{
		// Pasamos ambos a segundos
		int tiempoSegundos = tiempoASegundos();
		int tiempoSegundosT = t.tiempoASegundos();
		int restaTiemposSegundos = tiempoSegundos - tiempoSegundosT;
		if (restaTiemposSegundos < 0) {
			throw new ExcepcionTiempoInvalido("esta mal");
		} else {
			// Actualizamos nuestro tiempo para los segundos resultantes
			// de la resta
			actualizarTiempo(restaTiemposSegundos);
			return true;
		}
	}
}
