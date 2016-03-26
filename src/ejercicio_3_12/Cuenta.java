package ejercicio_3_12;
// La clase Cuenta con un constructor para validar E
// inicilializar la variable de instancia saldo de tipo Double

public class Cuenta 
{
	private double saldo; // Variable de instancia que almacena saldo
	
	//constructor
	public Cuenta (double saldoAdicional)
	{
		// Valida que SaldoAdicional sea mayor a 0.0;
		// Si no lo es, saldo se inicializa con el valor predeterminado 0.0
		
		if (saldoAdicional > 0.0)
			saldo = saldoAdicional;
	}// fin del constructor
	
	// Metodo que abona (suma) un monto de la cuenta
	public void abonar (double monto)
	{
		saldo = saldo + monto; // Suma el monto al saldo
	}// fin del metodo abonar
	
	// Metodo que devuelve el saldo de la cuenta
	public double obtenerSaldo(){
		return saldo; //Proporciona el valor del saldo al metodo que hizo la llamada
	}// fin del metodo obtenerSaldo
	
	// Metodo que Debita un saldo de la cuenta
	public void cargar(Double monto)
	{
		if (monto <= saldo){
			System.out.printf("\nDebitando %.2f al saldo de cuenta\n\n", monto);
			saldo = saldo - monto;
			
		}
		else
		{
			System.out.print("\nEl monto a Debitar excede el saldo total de la ultima cuenta");
		}
	}
	
}// fin de clase Cuenta
