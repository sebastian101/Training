package ejercicio_3_11;
//El constructor de LibroCalificaciones se utiliza para
//espcificar el nombre del curso cada vez que se crea cada obejto LibroCalificaciones

public class PruebaLibroCalificaciones 
{
	public static void main (String[] args)
	{
		// Crea objeto de LibroCalificaciones
		LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("Curso 1" , "Sebastián Duque");
		LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("Curso 2" , "Jazmin Quintero");		
		
		// Consume el metodo mostrarMensaje de la clase LibroCalificaciones
		miLibroCalificaciones1.mostrarMensaje();
		miLibroCalificaciones2.mostrarMensaje();
	}//Fin main
	

}// fin de la clase PruebaLibroCalificaciones
