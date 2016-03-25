package Capitulo3_7;

import java.util.Scanner;

// Entrada y salida de numeros de punto fotante con objetos Cuenta

public class PruebaCuenta 
{
	
	public static void main (String[] args)
	{
		
		Cuenta cuenta1 = new Cuenta (50.00); // Crea un objeto cuenta llamado Cuenta1
		Cuenta cuenta2 = new Cuenta (-7.53); // Crea un objeto cuenta llamado Cuenta2
		
		//muestra el saldo incial de cada objeto
		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());
		
		//Crea un objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner ( System.in );
		double montoDeposito; // deposita el monto escrito por el usuario
		
		System.out.print("Escriba el monto a depositar para cuenta1: "); // 
		montoDeposito = entrada.nextDouble(); // obtiene la entrada del usuario
		System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n", montoDeposito);
		cuenta1.abonar(montoDeposito); // sumna al saldo de la cuenta1 el valor de montoDeposito
		
		//muestra los saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo()); // Saldo actual cuenta1
		System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo()); // Saldo actual cuenta2
		
		System.out.print("Escriba el monto a depositar para la cuenta2: ");
		montoDeposito = entrada.nextDouble();// Se obtiene el valor a depositar
		System.out.printf("\n Sumando %.2f al saldo cuenta2\n\n", montoDeposito);
		cuenta2.abonar(montoDeposito);
		
		//Muestra saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo cuenta2: $%.2f\n", cuenta2.obtenerSaldo());
				
		
	}	// Fin main

} // Fin de la clase PruebaCuenta
