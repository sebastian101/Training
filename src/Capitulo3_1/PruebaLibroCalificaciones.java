package Capitulo3_1;
//Se les dice Clase Controladora
//Crea un objeto LibroCalificaciones y llama a su método mostrarMensaje


import java.util.Scanner; 

public class PruebaLibroCalificaciones 
{
	//Metodo main
	public static void main (String[] args)
	{
		// Creamos un objeto de la clase Scanner llamado entrada
		Scanner entrada = new Scanner(System.in);
		
		// Cramos un obeketo de la clase LibroCalificaciones llamado miLibroCalificaciones
		LibroCalificaciones miLibroCalificaciones = new  LibroCalificaciones();
		
		//Pide y recibe el nombre del curso como entrada
		System.out.println("Escriba el nombre del curso \n");
		String nombreDelCurso = entrada.nextLine(); // Lee una linea de texto
		System.out.println();// Imprime una linea en blanco
		
		// Llama al metodo mostrarMensaje de la clase LibroCalificaciones 
		// y pasa el nombre dle argumento
		
		miLibroCalificaciones.mostrarMensaje(nombreDelCurso);
		
	} //Fin Main	
}// Fin clase PruebaLibroCalificaciones
