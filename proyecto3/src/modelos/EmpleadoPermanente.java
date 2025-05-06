package modelos;

import excepciones.SalarioInvalidoException;
import interfaces.Bonificable;

public class EmpleadoPermanente extends EmpleadoBase implements Bonificable {
	private double porcentajeBeneficios;

	

	public EmpleadoPermanente(int id, String nombre, Cargo cargo, double salarioBase, int añosExperencia,
			double porcentajeBeneficios) throws SalarioInvalidoException {
		super(id, nombre, cargo, salarioBase, añosExperencia);
		this.porcentajeBeneficios = porcentajeBeneficios;
		this.salarioBase = calcularBonificacion();
		this.salarioBase = (50*añosExperencia)+(salarioBase* (porcentajeBeneficios/100));
	}



	@Override
	public double calcularBonificacion() {
		// TODO Auto-generated method stub
		return salarioBase=salarioBase*0.3+0.5;
	}
	
}
