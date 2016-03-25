package Capitulo2;
//Programa suma deitel
// Programa que muestra la suma de dos numeros

import java.util.Scanner; // El programa usa la clase scanner

public class Suma {
	
	// Metodo main
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int numero1, // Primer numero a sumar
		 	numero2, // Segundo numero a sumar
		 	suma; // Resultado de la suma
		
		System.out.print("Escriba el primer entero");
		numero1 = entrada.nextInt(); // Lee el primer numero del usuario
		
		System.out.print("Escriba el segundo numero");
		numero2 = entrada.nextInt(); // Lee el segundo numero del usuario 
		
		suma = numero1 + numero2; //Suma los dos numeros y almacena el resultado en la variable suma
		
		System.out.printf("La suma es %d\n", suma);
	
	} // Fin del metodo main

} // Fin de la clase Suma
