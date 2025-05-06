package modelos;

import excepciones.SalarioInvalidoException;

public abstract class Empleado {
	
	protected int id;
	protected String nombre;
	protected Cargo cargo;
	protected double salarioBase;
	
	public void calcularSalario() {
		
	}

	public Empleado(int id, String nombre, Cargo cargo, double salarioBase) throws SalarioInvalidoException {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		if (this.salarioBase <= 0) {
			throw new SalarioInvalidoException();
		}
	}
	
	
}
