package trabajador;

public class Comercial extends Trabajador {
	private int numeroClientes;
	
	public Comercial(String nombre, int salarioMensual, double saldo, int numeroClientes) {
		super(nombre, salarioMensual, saldo);
		// TODO Auto-generated constructor stub
		this.numeroClientes=numeroClientes;
	}

	public int getNumeroClientes() {
		return numeroClientes;
	}

	public void setNumeroClientes(int numeroClientes) {
		this.numeroClientes = numeroClientes;
	}
	
	public void pagoMensual() {
		setSaldo(getSaldo() + (getSalarioMensual() * 1.2));
	}
}
