package tp1;
import java.util.Scanner;

public class Ej3 {
	private static Scanner deMiTeclado= new Scanner (System.in);
	public static void main(String[] args) {
		
		String miNombre= "";
		
		System.out.println("Por favor ingrese su nombre");
		miNombre = deMiTeclado.nextLine();
		
		System.out.println("Bienvenida " + miNombre + " (*＾▽＾)／");
	}

}
