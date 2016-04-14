package capitulo4_8_centinela;
// Figura 4.6 
// La clase LibroCalificaciones que resuelve un problema promedio
// usando una reptición controlada por contador

import java.util.Scanner;

public class LibroCalificaciones {
	
	private String nombreDelCurso; //Nombre del curso que representa este libro de calificaciones
	
	// Constructor que inicializa el nombre del curso
	public LibroCalificaciones (String nombre){
		nombreDelCurso = nombre; //Inicializa el nombre del curso
	} // Fin del constructor
	
	// Metodo establecer el nombre del curso
	public void establecerNombreDelCurso (String nombre){
		nombreDelCurso = nombre; // Almacena el nombre del curso
	}// Fin del metodo establecer
	
	//Metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso (){
		return nombreDelCurso;
	}// Fin del metodo obtener
	
	// Muestra un mensaje de bienvenida al usuario del LibroCalificaciones
	public void mostrarMensaje (){
		// obtenerNombreDelCurso obtiene el nombre del curso
		System.out.printf( "Bienvenido al libro de calificaciones para  \n%s!\n\n", 
				obtenerNombreDelCurso() );
	}// fin del metodo mostrarMensaje
	
	//Determina el promedio de la clase, con base en las ultimas 10 calificaciones introducidas por el usuario
	public void determinarPromedioClase (){
		//Crea un objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner( System.in );
		
		int total; // Suma de las calificaciones escritas por el usuario
		int contadorCalif; // Numero de la siguiente calificacion a introducir
		int calificacion; // Valor de la calificacion escrito por el usuario
		Double promedio = null; // El promedio de las calificaciones
		
		// Fase de inicializacion
		total = 0;
		contadorCalif = 0;
		
		// Fase de procesamiento; Utiliza la repetición controlada por contador centinela
		
		System.out.print( "Escriba la calificacion o -1 para terminar: " ); // Indicador
		calificacion = entrada.nextInt(); // Lee la calificaion del usuario y la asigna a Calificacion
		
		while ( calificacion != -1 ){ //Itera las veces que desee el usuario			
			total = total + calificacion;
			contadorCalif = contadorCalif + 1;
			
			System.out.print( "Escriba la calificacion o -1 para terminar: " ); // Indicador
			calificacion = entrada.nextInt(); // Lee la calificaion del usuario y la asigna a Calificacion
		} // Fin del while
		
		//Fase de terminación
		// Si el usuario introdujo por menos una calificacion
		if (contadorCalif != 0 ){
		promedio =  (double) total  / contadorCalif; // Se realiza una división de un entero
		//Muestra el total y promedio de las calificaciones
		System.out.printf( "\nEl total de calififaciones %d introducidas es:%d\n",contadorCalif, total);
		System.out.printf( "\nEl promedio de la clase es:%.2f\n", promedio );
		} // Fin del if
		else // No se introdujeron calificaciones, por lo que se imprime un mensaje
			System.out.println( "No se introdujeron calificaciones" );
						
	} // Fin del metodo determinarPromedioClase

} //Fin de la clase LibroCalificaciones
