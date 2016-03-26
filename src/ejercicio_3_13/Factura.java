package ejercicio_3_13;

import javax.swing.JOptionPane;

// Muestra un articulo vendido en la Ferreteria


public class Factura {
	
	String numeroPieza;
	String descripcionPieza;
	int cantidadArticulo;
	double precioArticulo;
	
	// Constructor
	public Factura (String numeroPi, String descripcPi, int cantidad, double precio)
	{
		numeroPieza = numeroPi;
		descripcionPieza = descripcPi;
		cantidadArticulo = cantidad;
		precioArticulo = precio;
	}
	
	// Metodo para establecer numero de pieza
	public void establecerNumeroPieza (String numeroPi)
	{
		numeroPieza = numeroPi;
	}
	
	// Metodo para establecer descripción de la pieza
	public void establecerDescripcionPieza (String descripcPi)
	{
		descripcionPieza = descripcPi;
	}
	
	// Metodo para establecer la cantidad del articulo
	public void establecerCantidadArticulo (int cantidad)
	{
		cantidadArticulo = cantidad;
	}

	// Metodo para establecer el precio al articulo
	public void establecerPrecioArticulo (Double precio)
	{
		precioArticulo = precio;
	}
	
	// Metodo para obtener el numero de pieza
	public String obtenerNumeroPienza()
	{
		return numeroPieza;	
	}
	
	// Metodo para obtener la descripcion de la pieza
	public String obtenerDescripcionPieza()
	{
		return descripcionPieza;
	}
	
	// Metodo para obtener la cantidad del articulo
	public int obtenerCantidadArticulo()
	{
		return cantidadArticulo;
	}
	
	// Metodo para obtener el precio del articulo
	public double obtenerPrecioArticulo()
	{
		return precioArticulo;
	}
	
	
	//  Metodo para obtener el monto de la factura
	public double obtenerMontoFactura() 
	{		
		if (cantidadArticulo < 0)
			cantidadArticulo = 0;
		if (precioArticulo <= 0.0)
			precioArticulo = 0.0;
		double montoFactura = cantidadArticulo * precioArticulo;
		
		return montoFactura;
	}
	
	
	
	
	
}// Fin de la clase Factura
