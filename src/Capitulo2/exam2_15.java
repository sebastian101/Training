package Capitulo2;

import java.util.Scanner;

public class exam2_15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num1,
			num2,
			resultado;
		
		System.out.print("Digite el primer numero:\n");
		num1 = entrada.nextInt();
		
		System.out.print("Digite el segundo numero: \n");
		num2 = entrada.nextInt();
		
		resultado = num1 + num2;
		System.out.printf("El resultado de suma es: %d\n", resultado);
		
		resultado = num1 * num2;
		System.out.printf("El resultado de la multiplicacion es: %d\n", resultado);
		
		resultado = num1 - num2;
		System.out.printf("El resultado la resta  es: %d\n", resultado);
		
		resultado = num1 / num2;
		System.out.printf("El resultado la division  es: %d\n", resultado);
		
		

	}// fin del metodo main

}// fin de la clase exam2_15
