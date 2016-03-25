package Capitulo3_6;
//El constructor de LibroCalificaciones se utiliza para
//espcificar el nombre del curso cada vez que se crea cada obejto LibroCalificaciones

public class PruebaLibroCalificaciones 
{
	public static void main (String[] args)
	{
		// Crea objeto de LibroCalificaciones
		LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("Curso 1");
		LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("Curso 2");		
		
		// muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
		System.out.printf("El nombre del curso es %s\n", miLibroCalificaciones1.obtenerNombreDelCurso());
		System.out.printf("El nombre del curso es %s\n", miLibroCalificaciones2.obtenerNombreDelCurso());
	}//Fin main
	

}// fin de la clase PruebaLibroCalificaciones
