package ejercicios;

public class Ejercicio1 {

	/*
	 * Realiza un programa que muestre por pantalla los 20 primeros números
	 * naturales (1, 2, 3... 20).
	 */

	public static void main(String[] args) {
		// Creamos variable int
		int num = 1;
		
		//Creamos el bucle
		do {
			System.out.println(num);
			num++;
		} while(num < 21);
		
	}

}
