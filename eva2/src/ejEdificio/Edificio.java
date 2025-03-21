package ejEdificio;

import java.util.Scanner;

public class Edificio {
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private double altura;
	private int pisos;
	private Punto posicion;
	
	
	
	
	public Edificio() {
		System.out.println("nombre");
		setNombre(sc.next());
		System.out.println("Altura");
		setAltura(sc.nextDouble());
		System.out.println("Pisos");
		setPisos(sc.nextInt());
		System.out.println("posicion, X e Y");
		setPosicion(sc.nextInt(), sc.nextInt());
	}
	
	

	public void estadoObjeto() {
		System.out.println(getNombre());
		System.out.println(getAltura());
		System.out.println(getPisos());
		System.out.println(getPosicion());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(int x, int y) {
		this.posicion = new Punto(x, y);
	}

	public double distanciaConOtroEdificio(Edificio otroEdificio) {
		posicion.calcularDistancia(otroEdificio.getPosicion());
		return 0;
	}








	
	
	
	
}
