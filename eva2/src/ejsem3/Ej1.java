package ejsem3;
import java.util.*;
import java.util.Scanner;

public class Ej1 {
	public static boolean armstrong(int num) {
		
		int resultado =0;
		int digitos = calcularDigitos(num);
		
		while((num>0)) {
		resultado += Math.pow(num%10, digitos);
		num/=10;
		}
		
		return false;
		
	}
	public static int calcularDigitos(int num) {
		
		int contadorD =0;
		while (num>0) {
		contadorD++;
		num/=10;
		}
		System.out.println(contadorD);
		return contadorD;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		calcularDigitos(30);
	}

}
