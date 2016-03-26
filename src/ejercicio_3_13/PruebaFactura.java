package ejercicio_3_13;
// Clase para consumir los metodos de Factura y demostrar el funcionamiento

import javax.swing.JOptionPane;

public class PruebaFactura {

	public static void main(String[] args) 
	{
		Factura miFactura = new Factura(null, null, 0, 0);
	
		String numeroPieza = JOptionPane.showInputDialog("Bienvenido, en este programa usted podra generar facturas\n\n\n"
				+ "Ingrese el numero de pieza:"); 
		miFactura.establecerNumeroPieza(numeroPieza);		
		
		
		String descripcionPieza = JOptionPane.showInputDialog("Ingrese la descripción de la pieza");
		miFactura.establecerDescripcionPieza(descripcionPieza);
		
		
		String cantidadArticulos = JOptionPane.showInputDialog("Ingrese la cantidad de articulos");
		miFactura.establecerCantidadArticulo(Integer.parseInt(cantidadArticulos));
		
		String precioArticulo = JOptionPane.showInputDialog("Ingrese el precio unitario del articulo");
		miFactura.establecerPrecioArticulo(Double.parseDouble(precioArticulo));				
		
		Double montoFactura = miFactura.obtenerMontoFactura();

		String Mensaje = String.format("El valor de la factura es: $%.2f", montoFactura);
		
		JOptionPane.showMessageDialog(null, montoFactura);
	}

}
