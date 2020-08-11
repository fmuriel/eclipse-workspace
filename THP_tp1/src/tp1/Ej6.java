package tp1;
import java.util.Scanner;

public class Ej6 {
	private static Scanner deMiTeclado = new Scanner (System.in); 
	public static void main(String[] args) {
		int num1 = 0;
		
		System.out.println("Ingrese un valor entero mayor que cero:");
		num1= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		if(num1 % 2 == 0) {
			System.out.println("El valor ingresado es par");
		} else {
			System.out.println("El valor ingresado es impar");
		}

	}

}
