package tp1;
import java.util.Scanner;

public class Ej4 {
	private static Scanner deMiTeclado = new Scanner (System.in);
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese un primer valor");
		num1= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		System.out.println("Ingrese un segundo valor");
		num2= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado: " +(num1 + num2));
		
	}

}
