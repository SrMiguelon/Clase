package refresco;

public abstract class BebidaDestilada extends BebidaAlcoholica{
	private int id;
	public BebidaDestilada(String nombre, double graduacionAlcohol) {
        super(nombre, graduacionAlcohol);
        this.id=contadorId++;
    }

 
    public double calcularPrecio() {
        return 12 + (getGraduacionAlcohol() / 10.0);
    }


	@Override
	public String toString() {
		return "BebidaDestilada [id=" + id + "]";
	}

    


}
