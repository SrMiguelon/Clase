package poo;

public class Estudiante extends Persona {
	private int creditos;
	
	public Estudiante(String nombre, int edad, int creditos) {
		super(nombre, edad);
		this.creditos = creditos;
		
	}
	public String toString() {
		
		return super.toString() + "Creditos " + creditos;
		
	}
	
	
}
