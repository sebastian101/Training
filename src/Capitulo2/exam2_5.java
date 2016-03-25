package Capitulo2;

import java.util.Scanner;

// Programa examl 2.5
// El programa calculara el producto de tres enteros
public class exam2_5 {
	
	// Inicio del metodo main
	public static void main (String [] args)
	{
		
		Scanner entrada = new Scanner( System.in );
		
		int x,
			y,
			z,
			resultado;
		
		System.out.print("Escriba el primer entero\n");
		x = entrada.nextInt();
		
		System.out.print("Escriba el segundo entero\n");
		y = entrada.nextInt();
		
		System.out.print("Escriba el tercer entero\n");
		z = entrada.nextInt();
		
		resultado = (x * y * z);
		
		System.out.printf("El producto es:%d\n", resultado);
		
		
	}// Fin del metodo main

}// Fin de la clase exam2_5
