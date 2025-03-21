package refresco;

public class BebidaFermentada extends BebidaAlcoholica {
	private int id;
    public BebidaFermentada(String nombre, double graduacionAlcohol) {
        super(nombre, graduacionAlcohol);
        this.id=contadorId++;
        
    }

  
    public double obtenerPrecio() {
        return 5 + (getGraduacionAlcohol() / 10);  
    }


	@Override
	public String toString() {
		return "BebidaFermentada [id=" + id + "]";
	}
    
    
    
}