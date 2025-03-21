package refresco;

public abstract class BebidaAlcoholica extends Bebida {
    private double graduacionAlcohol;


    public BebidaAlcoholica(String nombre, double graduacionAlcohol) {
        super(nombre);
        this.graduacionAlcohol = graduacionAlcohol;

    }

	public double getGraduacionAlcohol() {
		return graduacionAlcohol;
	}

	public void setGraduacionAlcohol(double graduacionAlcohol) {
		this.graduacionAlcohol = graduacionAlcohol;
	}

	@Override
	public String toString() {
		return "BebidaAlcoholica [graduacionAlcohol=" + graduacionAlcohol + "]";
	}
	
	
}