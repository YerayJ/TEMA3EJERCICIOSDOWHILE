package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Realiza un programa que muestre la tabla de multiplicar de un número
	 * introducido por teclado. Por ejemplo, si se introduce el número 3 se debe
	 * imprimir lo siguiente:.
	 */

	public static void main(String[] args) {
		// Creamos variables int le añadimos valor 0 para inicianizarlas
		int num;
		int contador = 1;

		// Creamos un escaner
		Scanner key = new Scanner(System.in);

		// Pedimos variables por pantalla
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el bucle
		do {
			System.out.println(num + "x" + contador + "=" + num*contador);
			contador++;
		} while (contador < 11); // El bucle seguirá reproduciendo hasta el número par antes del 200.

		//Cerramos el escaner
		key.close();
		
	}

}
