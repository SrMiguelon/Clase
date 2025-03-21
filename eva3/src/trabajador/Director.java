package trabajador;

public class Director extends Trabajador{
	private int añosDeCargo;
	public Director(String nombre, int salarioMensual, double saldo, int añosDeCargo) {
		super(nombre, salarioMensual, saldo);
		// TODO Auto-generated constructor stub
		this.añosDeCargo=añosDeCargo;
	}
	
	public int getAñosDeCargo() {
		return añosDeCargo;
	}
	public void setAñosDeCargo(int añosDeCargo) {
		this.añosDeCargo = añosDeCargo;
	}

	
}
