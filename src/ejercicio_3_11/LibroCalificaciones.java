package ejercicio_3_11;
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso



public class LibroCalificaciones 
{
	private String nombreDelCurso; // Nombre del curso para este LibroCalificaciones
	private String nombreInstructor; // Nombre del instructor del curso
	
	// El constructor inicializa nombreDelCurso con un argumento String
	public LibroCalificaciones (String nombre, String nombreInst) // El nombre del constructor es el nombre de la clase
	{
		nombreDelCurso = nombre; // Inicializa la variable de instancia nombreDelCurso
		nombreInstructor = nombreInst; // Inicializa la variable de instancia nombreInstructor
	}
	
		//Metodo para establecer el nombre del curso
		public void establecerNombreDelCurso (String nombre)
		{
			nombreDelCurso = nombre;
		} // fin metodo establecerNombreDelCurso
		
		// Metodo para obtener el nombre del curso
		public String obtenerNombreDelCurso()
		{
			return nombreDelCurso;
		} //fin metodo obtenerNombreDelCurso
		
		// Metodo para establecer elnombre del curso
		public void establecerNombreInstructor (String nombreInst)
		{
			nombreInstructor = nombreInst;
		} // fin del metodo establecerNombreInstructor
		
		// Metodo para obtener el nombre del curso
		public String obtenerNombreInstructor ()
		{
			return nombreInstructor;
		} // Fin del metodo obtenerNombreInstructor
		
		//Metodo que muestra un mensaje de bienvenida al usaurio de LibroCalificaciones
		public void mostrarMensaje()
		{
			// llama el metodo obtenerNombreDelCurso apra obtener el nombre de curso 
			// que representa este LibroCalificaciones
			System.out.printf("Bienvenido al curso %S!", obtenerNombreDelCurso());
			System.out.printf("\nEste curso es presentado por : %S!\n\n", obtenerNombreInstructor());
		}// Fin del metodo mostrarMensaje
		
	} // Fin de la clase LibroCalificaciones

