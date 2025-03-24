package persona;

import java.util.Comparator;

public class Persona  implements Comparable<Persona>{
	private String nombre;
	private String dni;
	private int edad;
	private int cm;
	private boolean sexo;
	public Persona(String nombre, String dni, int edad, int cm, boolean sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.cm = cm;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", cm=" + cm + ", sexo=" + sexo + "]";
	}
	
	@Override
	public int compareTo(Persona otra) {
		// TODO Auto-generated method stub
		return Integer.compare(this.edad, otra.edad);
	}
	
	
}
