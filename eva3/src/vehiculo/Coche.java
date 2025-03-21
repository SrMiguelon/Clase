package vehiculo;

public class Coche extends Vehiculo {
	private int numeroPuertas;

	public Coche(String marca, String modelo, int año, String matricula, int numeroPuertas) {
		super(marca, modelo, año, matricula);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " numero de puertas: " + getNumeroPuertas();
	}
	
}
