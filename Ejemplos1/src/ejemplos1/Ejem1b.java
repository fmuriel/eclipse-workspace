package ejemplos1;
import java.util.Scanner; 

public class Ejem1b {
	private static Scanner deMiTeclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int valor1;
		int valor2;
		
		double resultado;
		double resultadoB;
		double resultadoC;
		
		
		String miNombre;
		
		//inicializando variables
		
		miNombre = "";
		valor1 = 0;
		valor2 = 0;
			
		//procesando datos
			
		System.out.println("Ingrese su nombre");
		
		miNombre = deMiTeclado.nextLine(); //devuelve lo ingresado en la linea siguiente
		
		System.out.println("Bienvenide " + miNombre);
		valor1= Integer.parseInt(deMiTeclado.nextLine());
		
		System.out.println("Ingrese el segundo valor");
		valor2= Integer.parseInt(deMiTeclado.nextLine());
		
		//para capturar un entero tenemos dos formas:
		//usar .nextInt() y luego .nextLine() para que absorba el ENTERO que queda colgado en el .nextInt()
		//usar Integer.parseInt()
		
		resultado= valor1 + valor2;
		resultadoB= valor1 * valor2;
		
		if(valor2 == 0) {
			System.out.println("No se puede dividir por cero. No se puede hacer la división");
			resultadoC = 0;
		} else {
			resultadoC = valor1 / valor2;			
		}
		
		
		//concatenamos una cadena alfanumerica con un valor numerico
		
		System.out.println("Los resultados son:" + resultado + "," + resultadoB + "y" + resultadoC );
		
		
	}

}
