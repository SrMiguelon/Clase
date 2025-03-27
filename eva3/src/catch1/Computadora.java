package catch1;

import java.util.Random;

public class Computadora  extends Dispositivo implements Encendible {

	public Computadora(boolean encendido) {
		super(encendido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() throws Exception {
		// TODO Auto-generated method stub
		Random random= new Random();
		int aleatorio = random.nextInt(10)+1;
		
		if (aleatorio>2) {
			throw new IllegalStateException("Fallo al encender");
		}
		else {
			setEncendido(true);
			System.out.println("esta encendido");
		}
	}

}
