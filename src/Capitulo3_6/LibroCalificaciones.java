package Capitulo3_6;
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso

public class LibroCalificaciones 
{
	private String nombreDelCurso; // Nombre del curso para este LibroCalificaciones
	
	// El constructor inicializa nombreDelCurso con un argumento String
	public LibroCalificaciones (String nombre) // El nombre del constructor es el nombre de la clase
	{
		nombreDelCurso = nombre; // Inicializa la variable de instancia
	}
	
	//Metodo para establecer el nombre del curso
		public void establecerNombreDelCurso (String nombre)
		{
			nombreDelCurso = nombre;
		} // fin metodo establecerNombreDelCurso
		
		// Metodo para obetner el nombre del curso
		public String obtenerNombreDelCurso()
		{
			return nombreDelCurso;
		} //fin metodo obtenerNombreDelCurso
		
		//Metodo que muestra un mensaje de bienvenida al usaurio de LibroCalificaciones
		public void mostrarMensaje()
		{
			// llama el metodo obtenerNombreDelCurso apra obtener el nombre de curso 
			// que representa este LibroCalificaciones
			System.out.printf("Bienvenido al libro de calificaciones para \n%S!\n", obtenerNombreDelCurso());
		}// Fin del metodo mostrarMensaje
		
	} // Fin de la clase LibroCalificaciones

