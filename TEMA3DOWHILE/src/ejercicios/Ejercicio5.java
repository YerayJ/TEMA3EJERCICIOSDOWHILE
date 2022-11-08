package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
	 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
	 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
	 * es mayor, menor o igual al número que ha pensado).
	 */

	public static void main(String[] args) {
		// Creamos variable String para pedirsela al usuario, las demás en int, ramdom
		// para crear un número aleatorio, mayor y menor como máximo y mínimo en el
		// rango.
		String usuario = "";
		int ramdom;
		int mayor = 101;
		int menor = 0;

		// Creamos un escaner
		Scanner key = new Scanner(System.in);

		// Creamos el bucle
		do {
			// Creamos un número un aleatorio en el que el rango varia al restar el número
			// mayor entre el número menor como número máximo y como mínimo será el número
			// menor.
			ramdom = (int) (Math.random() * (mayor - menor) + menor);
			// Le imprimimos un número entre el rango y le preguntamos si es ese.
			System.out.println("¿Tu número es " + ramdom + "?");
			// Le pedimos al usuario una respuesta y la almacenamos como cadena.
			usuario = key.nextLine();
			// En el siguiente if si el usuario nos dice que su número es menor guardaremos
			// la variable ramdom como el máximo ahora.
			if (usuario.equalsIgnoreCase("MENOR")) {
				mayor = ramdom;
				// En el siguiente if si el usuario nos dice que su número es mayor guardaremos
				// la variable ramdom como el mínimo ahora.
			} else if (usuario.equalsIgnoreCase("MAYOR")) {
				menor = ramdom;
			}
			// Este bucle terminará cuando el usuario nos indique que si es el número.
		} while (!usuario.equalsIgnoreCase("SI"));

		// Imprimimos fuera del bucle que ha acertado.
		System.out.println("Has acertado!");

		// Cerramos el escaner
		key.close();

	}

}
