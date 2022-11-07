package ejercicios;

public class Ejercicio2 {

	/*
	 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
	 * el 200.	  
	 */

	public static void main(String[] args) {
		// Creamos variable int le añadimos valor 0 para inicianizarla
		int num = 0;

		// Creamos el bucle
		do {
			System.out.println(num); // Imprimos el valor actual de la variable num
			num+=2; // Como queremos sacar los número pares le sumamos dos a la variable num
		} while (num < 200); // El bucle seguirá reproduciendo hasta el número par antes del 200.

	}

}
