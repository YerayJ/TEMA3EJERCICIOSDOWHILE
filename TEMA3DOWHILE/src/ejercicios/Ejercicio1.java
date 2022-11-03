package ejercicios;

public class Ejercicio1 {

	/*
	 * Realiza un programa que muestre por pantalla los 20 primeros números
	 * naturales (1, 2, 3... 20).
	 */

	public static void main(String[] args) {
		// Creamos variable int y le damos valor uno.
		int num = 1;

		// Creamos el bucle
		do {
			System.out.println(num); // Imprimos el valor actual de la variable num
			num++; // Vamos sumando uno al número
		} while (num < 21); // Se seguirá reproduciendo el bucle hasta el número 20.

	}

}
