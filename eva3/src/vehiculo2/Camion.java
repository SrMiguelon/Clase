package vehiculo2;

public class Camion extends Vehiculo implements Acelerable, Sonoro {

	public Camion(String marca, String modelo, double velocidad, int posicion, boolean parado) {
		super(marca, modelo, velocidad, posicion, parado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSonido() {
		// TODO Auto-generated method stub
		System.out.println("PRRRRRRRRRRRR");
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		if (velocidad==0) {
			this.velocidad=40;
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
		if (velocidad>120||velocidad<0) {
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
