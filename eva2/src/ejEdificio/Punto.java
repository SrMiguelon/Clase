package ejEdificio;

public final class Punto {
	private final int x;
	private final int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void devolverXeY() {
		System.out.println("X= " + getX()+ "Y= " + getY() );
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public double calcularDistancia(Punto otroPunto) {
		int distanciaX=  x- otroPunto.getX();
		int distanciaY=y- otroPunto.getY() ;
		return Math.sqrt(distanciaX *x + distanciaY*y);
		
	}

}
