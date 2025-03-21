package trabajador;

public class Trabajador {
	private String nombre;
	private int salarioMensual;
	private double saldo;

	public Trabajador(String nombre, int salarioMensual, double saldo) {
		this.nombre = nombre;
		this.salarioMensual = salarioMensual;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(int salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public void pagoMensual() {
		setSaldo(getSaldo() + getSalarioMensual());

	}
	
	public void pagoAnual() {
		if (getSalarioMensual()<1000) {
			setSaldo(Math.round(saldo+ (saldo *0.05)));
			
		}
		else {
			setSaldo(Math.round(saldo+ (saldo *0.05)));
		}
	}
	public String informacionTrabajador() {
		return "nombre: " + getNombre() + ", saldo: " + getSaldo()+ ", Salario: " + getSalarioMensual();
		
	}
}
