package vehiculo;

public class Camion extends Vehiculo {
	private double capacidadCarga;

	public Camion(String marca, String modelo, int año, String matricula, double capacidadCarga) {
		super(marca, modelo, año, matricula);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Capacidad de carga: " + getCapacidadCarga();
	}
}
