package estudiantes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private int edad;
	private double notaFinal;

	public Estudiante(String nombre, int edad, double notaFinal) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaFinal = notaFinal;
	}

	public String estadoEstudiante() {
		return "Nombre: " + nombre + " edad: " + edad + " nota final: " + notaFinal;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes = new ArrayList<>();

		Estudiante e1 = new Estudiante("pepe", 13, 18);
		Estudiante e2 = new Estudiante("luis", 17, 10);
		Estudiante e3 = new Estudiante("gustavo", 43, 1);

		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);

		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.estadoEstudiante());
		}
		System.out.println("METE NOMBRE");
		String nombreE = sc.next();
		
		for (int i = 0; i < estudiantes.size(); i++) {
			if (estudiantes.get(i).nombre.equals(nombreE)) {
				estudiantes.remove(i);
				i = estudiantes.size();
				System.out.println("borrado");
			} else if (i == estudiantes.size() - 1) {
				System.out.println("no existe");
			}
		}
		

	}
}
