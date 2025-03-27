package catch1;

public abstract class Dispositivo implements Encendible{
	private boolean encendido;
	
	
	protected Dispositivo(boolean encendido) {

		this.encendido = encendido;
	}


	@Override
	public void apagar() throws Exception {
		// TODO Auto-generated method stub
			if (!encendido) {
				throw new IllegalStateException("esta apagado");
			}
			encendido=false;
	}


	protected boolean isEncendido() {
		return encendido;
	}


	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	
	
	
	
}
