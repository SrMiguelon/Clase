package refresco;

public abstract class Bebida {
    protected static int contadorId = 1;
    private int id;
    private  String nombre;

    public Bebida(String nombre) {
        this.id = contadorId++;
        this.nombre = nombre;
    }

 
    public static int getContadorId() {
		return contadorId;
	}


	public static void setContadorId(int contadorId) {
		Bebida.contadorId = contadorId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract double obtenerPrecio();


	@Override
	public String toString() {
		return "Bebida [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}