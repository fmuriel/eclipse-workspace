package tp1;
import java.util.Scanner;

public class Ej8 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int dia = 0;
		String diaTexto = "";
		int restart = 0;
		
		do {
			//La primera vez corro todo el programa
			System.out.println("Ingrese un número del 1 al 7 y yo devuelvo a qué dia corresponde");
			dia= input.nextInt();
			input.nextLine();
			
			while(dia <= 0 || dia > 7) {
				//Valido que ingrese un nro entre 1 y 7 y sino, repregunto hasta que lo haga
				System.out.println("¡Condición no cumplida! El día ingresado no es válido");
				System.out.println("Ingrese un número del 1 al 7 y yo devuelvo a qué dia corresponde");
				dia= input.nextInt();
				input.nextLine();
			}
			
			//Una vez que lo hizo, sale del while y corre el switch para matchear el número con el texto que voy a devolver y guardarlo para mostrarlo
			
			switch(dia){
				case 1:
					diaTexto = "Lunes";
					break;
				case 2:
					diaTexto = "Martes";
					break;
				case 3:
					diaTexto = "Miércoles";
					break;
				case 4:
					diaTexto = "Jueves";
					break;
				case 5:
					diaTexto = "Viernes";
					break;
				case 6:
					diaTexto = "¡por fin Sábado!";
					break;
				case 7:
					diaTexto = "domingo bajonero porque mañana se trabaja :(";
					break;
				default:
					diaTexto = "El día ingresado no es válido";
					break;
			}
			
			//Muestro el dia
			System.out.println("El dia es: " + diaTexto);
			
			//Pregunto si quiere volver a empezar
			System.out.println("Ingrese 1 para volver a empezar, 2 para salir");
			restart= input.nextInt();
			input.nextLine();
			
			
			while(restart != 1 && restart != 2) {
				//Chequeo que esté eligiendo entre las opciones que le di y sino repregunto
				System.out.println("Ha ingresado una opción inválida");
				System.out.println("Ingrese 1 para volver a empezar, 2 para salir");
				restart= input.nextInt();
				input.nextLine();
			}
			
		//Condicion de ciclaje es chequear si eligió 1: sigo ciclando, si eligió 2: muestro mensaje de despedida	
		} while(restart == 1);
		//Muestro mensaje de salida
		System.out.println("¡Gracias por su consulta!");			
	}

}
