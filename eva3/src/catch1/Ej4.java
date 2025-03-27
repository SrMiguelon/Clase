package catch1;

import java.util.Random;

public class Ej4 {
	public static void main(String[] args) {
		Random random = new Random();
		Televisor tv1 = new Televisor(random.nextBoolean());
		Computadora pc1 = new Computadora(random.nextBoolean());
		Computadora pc2 = new Computadora(random.nextBoolean());
		
		Dispositivo[] dispositivos = { tv1, pc1, pc2 };
		for (Dispositivo dispositivo : dispositivos) {
			
		}
		for (int i = 0; i < dispositivos.length; i++) {
			try {

				dispositivos[i].encender();

	 		} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

		}
	}
}
