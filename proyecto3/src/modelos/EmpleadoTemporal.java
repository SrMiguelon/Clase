package modelos;

import java.util.Date;

import excepciones.SalarioInvalidoException;

public class EmpleadoTemporal extends Empleado{
	private Date fechaFinContrato;

	public EmpleadoTemporal(int id, String nombre, Cargo cargo, double salarioBase, Date fechaFinContrato)
			throws SalarioInvalidoException {
		super(id, nombre, cargo, salarioBase = salarioBase*0.8);
		this.fechaFinContrato = fechaFinContrato;
	}
	
}
