package vehiculo;

public class Moto extends Vehiculo {
	private int cilindrada;

	public Moto(String marca, String modelo, int año, String matricula, int cilindrada) {
		super(marca, modelo, año, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Cilindrada: " + getCilindrada();
	}
	

	
}
