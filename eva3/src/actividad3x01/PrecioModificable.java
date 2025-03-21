package actividad3x01;

public abstract interface PrecioModificable {

	public double calcularPrecioConIVA();

	public double calcularPrecioOferta(double descuento);

	public double calcularPrecioPorCantidad(int cantidad);

}
