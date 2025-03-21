package actividad3x01;

public class Libro implements PrecioModificable {
	private String titulo;
	private int añoPublicacion;
	private String escritor;
	private double precio;

	public Libro(String titulo, int añoPublicacion, String escritor, double precio) {
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.escritor = escritor;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", añoPublicacion=" + añoPublicacion + ", escritor=" + escritor + ", precio="
				+ precio + "]";
	}

	@Override
	public double calcularPrecioConIVA() {
		// TODO Auto-generated method stub
		return precio + (precio * 0.04);
	}

	@Override
	public double calcularPrecioOferta(double descuento) {
		// TODO Auto-generated method stub
		return calcularPrecioConIVA() - descuento;

	}

	@Override
	public double calcularPrecioPorCantidad(int cantidad) {
		// TODO Auto-generated method stub

		if (cantidad >= 10 && cantidad <= 99) {
			return calcularPrecioOferta(0.03);
		} else if (cantidad >= 100 && cantidad <= 999) {
			return calcularPrecioOferta(0.08);
		} else if (cantidad >= 1000) {
			return calcularPrecioOferta(0.16);
		} else {
			return calcularPrecioOferta(0);
		}

	}

}
