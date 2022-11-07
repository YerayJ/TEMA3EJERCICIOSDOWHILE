package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Realiza un programa que muestre la tabla de multiplicar de un número
	 * introducido por teclado. Por ejemplo, si se introduce el número 3 se debe
	 * imprimir lo siguiente:.
	 */

	public static void main(String[] args) {
		// Creamos variable num para pedírsela al usuario y la variable ramdom que
		// generará un número aleatorio desde el 1 al 100.
		int num;
		int ramdom = (int) (Math.random() * 100 + 1);

		// Creamos un escaner
		Scanner key = new Scanner(System.in);

		// Pedimos variables por pantalla
		System.out.println("Deme un número entre el 1 y el 100: ");
		num = key.nextInt();

		// Creamos el bucle y un primer if para ver que el número entrante está dentro del rango.

		do {
			if (num == ramdom) { // Si num es igual a ramdom el bucle acabará y habremos acertado.
				System.out.println("Has acertado");
				break;
			} else if (num < ramdom) { // Si num es menor que ramdom le deberemos decir que el número es mayor el bucle
										// volverá a ejecutarse.
				System.out.println("El número es mayor");
			} else { // Si num es mayor que ramdom le deberemos decir que el número es menor el bucle
				// volverá a ejecutarse.
				System.out.println("El número es menor");
			}
			num = key.nextInt(); // Volvemos a pedir un número al usuario, ya que no ha acertado.
		} while (num < 101 && num > 0); // Con este while comprobamos que el número que introduce el usuario está dentro
										// del rango.

		
		
		// Cerramos el escaner
		key.close();

	}

}
