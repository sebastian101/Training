package Capitulo2;
// Comparacion deitel
// Comparacion enteros utilizando instrucciones if, operadores relacionales y de igualdad

import java.util.Scanner;

public class Comparacion {

	// Inicio del metodo main
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner ( System.in );
		
		int numero1, // Primer numero a comparar
			numero2; // Segundo numero a comparar
		
		System.out.print ("Escriba el primer numero");
		numero1 = entrada.nextInt(); // Lee el primer numero
		
		System.out.print ("Escriba el segundo numero");
		numero2 = entrada.nextInt(); // Lee el segundo numero
		
		if (numero1 == numero2)
			System.out.printf ("%d == %d\n", numero1, numero2);
		
		if (numero1 != numero2)
			System.out.printf ("%d != %d\n", numero1, numero2);
		
		if (numero1 < numero2)
			System.out.printf ("%d < %d\n", numero1, numero2);
		
		if (numero1 > numero2)
			System.out.printf ("%d > %d\n", numero1, numero2);
		
		if (numero1 <= numero2)
			System.out.printf ("%d <= %d\n", numero1, numero2);
		
		if (numero1 >= numero2)
			System.out.printf ("%d >= %d\n", numero1, numero2);

	} // Fin del metodo main

}// Fin de la clase Comparacion
