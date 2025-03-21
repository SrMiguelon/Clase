package ejSem3;

public class CuentaBancaria {
	public String titular;
	public double saldo;
	public int numeroCuenta;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
	public void depositar(int cantidad) {
		saldo+=cantidad;
	}
	public void retirar(int cantidad) {
		saldo-=cantidad;
	}
	public void mostrarSaldo() {
		System.out.println(saldo);
	}
}
