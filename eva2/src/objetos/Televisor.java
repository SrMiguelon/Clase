package objetos;

class Televisor {
	private int canalInicial;
	
	public Televisor() {
		
	}
	public Televisor(int canal) {
		this.canalInicial=canal;
	}
	
	public void subirCanal() {
		canalInicial++;
	}
	public void bajarCanal() {
		canalInicial--;
	}
	public int getCanal() {
		
		return canalInicial;
		
	}
 }
