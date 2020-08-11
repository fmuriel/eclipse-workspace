package tp1;
import java.util.Scanner;

public class Ej5 {
	private static Scanner deMiTeclado = new Scanner (System.in);
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese un valor numérico:");
		num1 = deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		System.out.println("Ingrese un segundo valor numérico:");
		num2= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		if(num2 != 0) {
			System.out.println("El resultad de " + num1 + " / " + num2 + " da como resultado " + num1 / num2);
		} else {
			System.out.println("No se puede dividir por cero");
		}
		
	}

}




