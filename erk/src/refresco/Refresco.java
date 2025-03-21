package refresco;

public class Refresco extends Bebida {
    private boolean tieneGas;
    private double cantidadAzucar; 
    private int id;




	public Refresco(String nombre, boolean tieneGas, double cantidadAzucar) {
        super(nombre);
        this.tieneGas = tieneGas;
        this.cantidadAzucar = cantidadAzucar;
        this.id=contadorId++;
    }
	
    public boolean isTieneGas() {
		return tieneGas;
	}


	public void setTieneGas(boolean tieneGas) {
		this.tieneGas = tieneGas;
	}


	public double getCantidadAzucar() {
		return cantidadAzucar;
	}


	public void setCantidadAzucar(double cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
 
    public double obtenerPrecio() {
        return 1 + (cantidadAzucar / 10);
    }
}