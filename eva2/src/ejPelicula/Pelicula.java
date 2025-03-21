package ejPelicula;

import java.util.Scanner;

public class Pelicula {
	Scanner sc = new Scanner(System.in);
	private static int pelisVistas=0;
	private int minutosDuracion;
	private boolean dobladaCastellano;
	private double puntuacion;
	private String titulo;
	
public Pelicula(String titulo, int minutosDuracion, boolean dobladaCastellano ){
	setTitulo(titulo);
	setMinutosDuracion(minutosDuracion);
	setDobladaCastellano(dobladaCastellano);
	pelisVistas++;


	}
public Pelicula(String titulo, int minutosDuracion, boolean dobladaCastellano, double puntuacion ){
	
	setTitulo(titulo);
	setMinutosDuracion(minutosDuracion);
	setDobladaCastellano(dobladaCastellano);
	setPuntuacion(puntuacion);
	pelisVistas++;
}
	
	
	public int getMinutosDuracion() {
		System.out.print("Minutos de duracion ");
		return minutosDuracion;
	}
	public void setMinutosDuracion(int minutosDuracion) {
		if (minutosDuracion<=0) {
			this.minutosDuracion = 90;
		}
		else {
			this.minutosDuracion=minutosDuracion;
		}
	}
	public boolean isDobladaCastellano() {
		System.out.print("esta doblada? ");
		return dobladaCastellano;
	}
	public void setDobladaCastellano(boolean dobladaCastellano) {

		this.dobladaCastellano = dobladaCastellano;
	}
	public double getPuntuacion() {
		System.out.print("Puntuacion: ");
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		if(puntuacion>10 && puntuacion<0) {
			this.puntuacion = 5;
		}
		else {
			this.puntuacion=puntuacion;
		}
		this.puntuacion = puntuacion;
	}
	public String getTitulo() {
		System.out.print("Titulo: ");
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public static int getPelisVistas() {
		return pelisVistas;
	}

	
	



	
}
