package Capitulo3_4;
// Crea y manipula un objeto LibroCalificaciones

import java.util.Scanner;

public class PruebaLibroCalificaciones 
{
	public static void main (String [] args)
	{
		//Crea un obejto Scanner para obtener la entrada de la ventana de los comandos
		Scanner entrada = new Scanner (System.in);
		
		//Crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		
		//Muestra el valor inicial de nombreDelCurso
		System.out.printf("El nombre inicial del curso es: %s\n\n", miLibroCalificaciones.obtenerNombreDelCurso());
		
		// pide y lee el nombre del curso
		System.out.println("Escriba el nombre del curso:");
		String elNombre = entrada.nextLine();
		miLibroCalificaciones.establecerNombreDelCurso(elNombre); // Establece el nombre del curso
		System.out.println();//imprime linea en blanco
		
		//Muestra el mensaje de bienvenida despues de especificar el nombre del curso
		miLibroCalificaciones.mostrarMensaje();
	} // fin main

}// fin de la clase PruebaLibroCalificaciones
