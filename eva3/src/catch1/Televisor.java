package catch1;

public class Televisor extends Dispositivo implements Encendible {

	public Televisor(boolean encendido) {
		super(encendido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() throws Exception {
		// TODO Auto-generated method stub
		if (isEncendido()) {
			throw new IllegalStateException("ya esta encendido");
		}
		else {
			setEncendido(true);
			System.out.println("esta encendido");
		}
	}



}
