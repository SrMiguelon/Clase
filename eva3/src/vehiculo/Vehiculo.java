package vehiculo;

import java.util.Objects;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int año;
	private String matricula;

	public Vehiculo(String marca, String modelo, int año, String matricula) {

		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marca: " + getMarca() + " Modelo: " + getModelo() + " año: " + getAño() + " Matricula: "
				+ getMatricula();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Vehiculo v1 = (Vehiculo) obj;
		if ((this instanceof Coche && obj instanceof Coche) || (this instanceof Moto && obj instanceof Moto)
				|| (this instanceof Camion && obj instanceof Camion)) {
			return año == v1.año && marca == v1.marca && matricula == v1.matricula && modelo == v1.modelo;
		} else {
			return false;
		}

	}

	public int hashCode(Object[] obj) {
		// TODO Auto-generated method stub
		return Objects.hash(marca, año, matricula, modelo);
	}

}
