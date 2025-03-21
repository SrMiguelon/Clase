package trabajador;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<Trabajador> trabajadores = new ArrayList<>();
		Director d1 = new Director("Raul", (int) random.nextInt(1600) + 600, (int) random.nextInt(5000) + 1, 5);
		Comercial c1 = new Comercial("Joan", (int) random.nextInt(1600) + 600, (int) random.nextInt(5000) + 1, 20);
		Operario o1 = new Operario("Pedro", (int) random.nextInt(1600) + 600, (int) random.nextInt(5000) + 1);
		Operario o2 = new Operario("Vicky", (int) random.nextInt(1600) + 600, (int) random.nextInt(5000) + 1);
		
		trabajadores.add(d1);
		trabajadores.add(c1);
		trabajadores.add(o1);
		trabajadores.add(o2);
		for (Trabajador trabajador : trabajadores) {
			System.out.println(trabajador.informacionTrabajador());
		}
		System.out.println();
		for (Trabajador trabajador : trabajadores) {
			trabajador.pagoMensual();
		}
		for (Trabajador trabajador : trabajadores) {
			System.out.println(trabajador.informacionTrabajador());
		}
		System.out.println();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador.getSaldo()>1000) {
				trabajador.pagoAnual();
			}
		}
		for (Trabajador trabajador : trabajadores) {
			System.out.println(trabajador.informacionTrabajador());
		}
	}
	

}
