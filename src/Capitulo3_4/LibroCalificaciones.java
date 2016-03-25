/**
 * 
 */
package Capitulo3_4;
// Clase LibroCalificaciones que contiene una variable de instancia nombreDelCurso
// y metodos para establecer su valor
/**
 * @author Sebastian Duque
 *
 */
public class LibroCalificaciones {
	
	private String nombreDelcurso; // Nombre del curso para este LibroCalificaciones
	
	//Metodo para establecer el nombre del curso
	public void establecerNombreDelCurso (String nombre)
	{
		nombreDelcurso = nombre;
	} // fin metodo establecerNombreDelCurso
	
	// Metodo para obetner el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelcurso;
	} //fin metodo obtenerNombreDelCurso
	
	//Metodo que muestra un mensaje de bienvenida al usaurio de LibroCalificaciones
	public void mostrarMensaje()
	{
		// llama el metodo obtenerNombreDelCurso apra obtener el nombre de curso 
		// que representa este LibroCalificaciones
		System.out.printf("Bienvenido al libro de calificaciones para \n%S!\n", obtenerNombreDelCurso());
	}// Fin del metodo mostrarMensaje
	
} // Fin de la clase LibroCalificaciones
