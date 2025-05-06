package modelos;

import excepciones.SalarioInvalidoException;
import interfaces.Bonificable;

public class EmpleadoBase extends Empleado implements Bonificable {
	private int añosExperencia;

	public EmpleadoBase(int id, String nombre, Cargo cargo, double salarioBase, int añosExperencia)
			throws SalarioInvalidoException {
		
		super(id, nombre, cargo, salarioBase);
		this.añosExperencia = añosExperencia;
		salarioBase =calcularBonificacion();
		salarioBase *= 0.5;
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double calcularBonificacion() {
		return salarioBase=salarioBase*0.5;
	}
	

}
