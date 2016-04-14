package capitulo4_8_centinela;
// Crea un objeto LibroCalificaciones e invoca a su metodo obtenerPromedioClase

public class PruebaLibroCalificaciones {

	public static void main(String[] args) {
		// Crea un objeto de miLibroCalifiaciones de la clase LibroCalificaciones 
		// y pasa el nombre del curso al constructor
		
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones( "CS01 While" );
		
		miLibroCalificaciones.mostrarMensaje(); // Muestra el mensaje de bienvenida
		miLibroCalificaciones.determinarPromedioClase(); // Ejecuta el metodo que determina el promedio
		

	} // Fin del main

} // Fin de la clase PruebaLibroCalificaciones
