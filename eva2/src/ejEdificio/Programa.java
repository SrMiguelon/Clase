package ejEdificio;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		Punto punto0 = new Punto(0,0);
		
		Punto puntoMasLejano= new Punto(0,0);
		
		Punto[] puntos = new Punto[10];
		
		double distancia = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			int aleatorioX = random.nextInt(100) + 1;
			int aleatorioY = random.nextInt(100) + 1;
			puntos[i] = new Punto(aleatorioX, aleatorioY);
		}
		
		
		for (int i = 0; i < puntos.length; i++) {
			System.out.println(puntos[i].getX() + " " + puntos[i].getY());
			if(distancia < puntos[i].calcularDistancia(punto0)) {
				distancia = puntos[i].calcularDistancia(punto0);
				puntoMasLejano = puntos[i];
			}
		}
		System.out.println();
		System.out.println("el punto mas lejano de x es " + puntoMasLejano.getX()+ " el punto mas lejano de y es " + puntoMasLejano.getY());
		
	}

}
