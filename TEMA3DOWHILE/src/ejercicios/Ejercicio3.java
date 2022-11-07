package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
	 * el 200.	  
	 */

	public static void main(String[] args) {
		// Creamos variables int le añadimos valor 0 para inicianizarlas
		int inicio = 0;
		int contador = 0;
		int limite;
		
		//Creamos un escaner
		Scanner key = new Scanner(System.in);
		
		//Pedimos variables por pantalla
		System.out.println("Deme un número: ");
		limite = key.nextInt();
		
		// Creamos el bucle
		do {
			inicio+=contador; // Como queremos sacar los número pares le sumamos dos a la variable num
			contador++;
		} while (contador <= limite); // El  bucle seguirá reproduciendo hasta el número par antes del 200.
		
		System.out.println(inicio);
	}

}
