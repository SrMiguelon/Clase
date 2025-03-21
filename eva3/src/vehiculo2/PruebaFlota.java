package vehiculo2;

public class PruebaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil auto = new Automovil("Toyota", "Corolla", 0, 0, true);
		Camion camion = new Camion("Volvo", "FH16", 0, 0, true);
		Bicicleta bici = new Bicicleta("Giant", "Escape 3", 0, 0, true);

		auto.arrancar();
		auto.emitirSonido();
		System.out.println(auto.detalles());
		System.out.println();
		
		
		camion.arrancar();
		camion.emitirSonido();
		System.out.println(camion.detalles());

		bici.arrancar();
		System.out.println(bici.detalles());
	}

}
