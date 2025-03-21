package actividad3x01;

public class Pelicula implements PrecioModificable {
	private String titulo;
	private int añoEstreno;
	private String director;
	private double precio;
	
	public Pelicula(String titulo, int añoEstreno, String director, double precio) {
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.director = director;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", añoEstreno=" + añoEstreno + ", director=" + director + ", precio="
				+ precio + "]";
	}

	@Override
	public double calcularPrecioConIVA() {
		// TODO Auto-generated method stub
		return  precio + (precio * 0.1);
	}

	@Override
	public double calcularPrecioOferta(double descuento) {
		// TODO Auto-generated method stub
		return calcularPrecioConIVA() - descuento;
	}

	@Override
	public double calcularPrecioPorCantidad(int cantidad) {
		// TODO Auto-generated method stub
		if (cantidad >= 5 && cantidad <= 49) {
			return calcularPrecioOferta(0.03);
		} else if (cantidad >= 50 && cantidad <= 499) {
			return calcularPrecioOferta(0.06);
		} else if (cantidad >= 500) {
			return calcularPrecioOferta(0.12);
		} else {
			return calcularPrecioOferta(0);
		}
	}
	
	
	
	
}
