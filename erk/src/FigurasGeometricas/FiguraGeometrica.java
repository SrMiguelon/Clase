package FigurasGeometricas;

public abstract class FiguraGeometrica {
	
	
    public abstract double calcularArea();
   
    public abstract double calcularPerimetro();
    
    public String toString() {
        return "Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro();
    }
}