package FigurasGeometricas;

class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	
	public Rectangulo(double base,double altura) {
		this.base=base;
		this.altura=altura;
	}
	public double calcularArea() {
		return base * altura;
	}
	public double calcularPerimetro() {
		return 2 * (base * altura);
	}
	
	

}
