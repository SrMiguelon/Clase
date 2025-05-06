package ficherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ej1 {
	public static void main(String[] args) {
		String nombreArchivo = "ejemplo.dat";
		int numero = 1;
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\ejemplo.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("prg");
			dos.writeInt(1);
			dos.writeDouble(7.8);
			dos.close();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\1DAW\\eclipse-workspace\\eva3\\src\\txt\\ejemplo.dat");
			DataInputStream dis = new DataInputStream(fis);
			String cadena = dis.readUTF();
			int numero1 = dis.readInt();
			double decimal = dis.readDouble();

			System.out.println("Valor leído de nombre: " + cadena);
			System.out.println("Valor leído de num: " + numero1);
			System.out.println("Valor leído de nombre: " + decimal);
			dis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
