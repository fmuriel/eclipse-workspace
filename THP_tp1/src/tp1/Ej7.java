package tp1;
import java.util.Scanner;

public class Ej7 {
	private static Scanner deMiTeclado = new Scanner (System.in);
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Ingrese el primer número entero");
		num1= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		System.out.println("Ingrese el segundo número entero");
		num2= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		System.out.println("Ingrese el tercer número entero");
		num3= deMiTeclado.nextInt();
		deMiTeclado.nextLine();
		
		if (num1 == num2 && num1 == num3) {
			System.out.println("Los números son iguales");
		} else if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("El número " + num1 + " es el mayor número ingresado.");
			} else {
				System.out.println("El número " + num3 + " es el mayor número ingresado.");
			}
		} else if(num2 > num3) {
			System.out.println("El número " + num2 + " es el mayor número ingresado.");
		} else {
			System.out.println("El número " + num3 + " es el mayor número ingresado.");
		}
	}

}
