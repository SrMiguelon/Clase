package vehiculo2;

public abstract class Vehiculo {
	
	public String marca;
	public String modelo;
	public double velocidad;
	public int posicion;
	public boolean parado;
	
	public Vehiculo(String marca, String modelo, double velocidad, int posicion, boolean parado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.posicion = posicion;
		this.parado = parado;
	}


	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getVelocidad() {
		return velocidad;
	}



	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}



	public int getPosicion() {
		return posicion;
	}



	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}



	public boolean isParado() {
		return parado;
	}



	public void setParado(boolean parado) {
		this.parado = parado;
	}



	public String detalles() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", posicion=" + posicion
				+ ", parado=" + parado + "]";
	}
	
	public void actualizaPosicionUltimaHora() {
		posicion += velocidad;
	}
	

}
