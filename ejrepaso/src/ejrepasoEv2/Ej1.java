package ejrepasoEv2;

import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] vector1 = new int [5];
		int[] vector2 = new int [5];
		int[] vector3 = new int [5];
		
		for (int i = 0; i < vector1.length; i++) {
			vector1[i]=random.nextInt(11);
			vector2[i]=random.nextInt(11);
			vector3[i] = vector1[i]+vector2[i];
			System.out.println(vector1[i] + " + " + vector2[i] + " = " + vector3[i]);
		}
	}

}
