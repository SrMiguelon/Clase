package act3;

public class Tiempo {
	private int horas = 0;
	private int minutos = 0;
	private int segundos = 0;

	public Tiempo(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public boolean validar(int horas, int minutos, int segundos) {
		if ((horas >= 0 && horas <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59)) {
			return true;
		} else {
			return false;
		}

	}

	public String obtenerEstado() {

		return String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
	}

	public boolean sumar(Tiempo t2) {

		int segundosTotal = (horas * 3600) + (minutos * 60) + segundos + (t2.horas * 3600) + (t2.minutos * 60)
				+ t2.segundos;

		int hh = segundosTotal / 3600;
		int mm = (segundosTotal % 3600) / 60;
		int ss = segundosTotal % 60;
		if (hh <= 23 && mm <= 59 && ss <= 59) {
			horas = hh;
			minutos = mm;
			segundos = ss;
			return true;

		} else {
			return false;
		}

	}

	public boolean restar(Tiempo t2) {

		int segundosTotal = (horas * 3600) - (minutos * 60) - segundos - (t2.horas * 3600) - (t2.minutos * 60)
				- t2.segundos;

		int hh = segundosTotal / 3600;
		int mm = (segundosTotal % 3600) / 60;
		int ss = segundosTotal % 60;
		if (hh >= 0 && mm >= 0 && ss >= 0) {
			horas = hh;
			minutos = mm;
			segundos = ss;
			return true;

		} else {
			return false;
		}

	}

}
