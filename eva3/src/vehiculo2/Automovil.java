package vehiculo2;

public class Automovil extends Vehiculo implements Acelerable, Sonoro {

	public Automovil(String marca, String modelo, int velocidad, int posicion, boolean parado) {
		super(marca, modelo, velocidad, posicion, parado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSonido() {
		// TODO Auto-generated method stub
		System.out.println("PIIIIIIIIIIIIIIIII");
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		if (velocidad==0) {
			this.velocidad=50;
			this.parado=false;
		}
	}

	@Override
	public void detener() {
		// TODO Auto-generated method stub
		this.velocidad=0;
		this.parado=true;
	}

	@Override
	public void acelerar(double velocidad) {
		// TODO Auto-generated method stub
		if (velocidad>200||velocidad<0) {
			System.out.println("error");
		}
		else {
			this.velocidad+=velocidad;
		}
	}

	@Override
	public void frenar(double velocidad) {
		// TODO Auto-generated method stub
		if (this.velocidad>velocidad) {
			this.velocidad-=velocidad;
		}
		else {
			this.velocidad=0;
			this.parado=true;
		}
	}

}
