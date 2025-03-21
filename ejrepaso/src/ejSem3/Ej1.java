package ejSem3;

public class Ej1 {
	
	
	
public static boolean armstrong (int entero) {
	int copiaEntero=entero;
	int decimales=0;
	int resultado=0;
	 while(copiaEntero>0) {
		 copiaEntero/=10;
		 decimales++;
	 }
	 copiaEntero=entero;
	 while(copiaEntero>0) {
		 resultado+= Math.pow(copiaEntero%10, decimales);
		 copiaEntero/=10;
	 }
	 if (resultado==entero) {
		 return true;
		
	}
	 else {
		 return false;
	}
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(armstrong(153));
	}

}
