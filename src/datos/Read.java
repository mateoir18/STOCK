package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudas.ProductoCreator;

import objetos.Producto;

public class Read {

	public static String FICHERO1 = "C:\\Users\\User\\Documents\\stock1.txt";
	public static String FICHERO2 = "C:\\Users\\User\\Documents\\stock2.txt";
	
	public static Iterator<Producto> readFiles(String fichero){
		
		BufferedReader  ficheroEntrada;
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			String id = ficheroEntrada.readLine();
			
			while(id!=null) {
				String nombre = ficheroEntrada.readLine();
				
				String cantidad = ficheroEntrada.readLine();
				
				String precio = ficheroEntrada.readLine();
				
				 Producto productonew = ProductoCreator.ConstruirProducto(id, nombre, cantidad, precio);
				 
				
				 
				 productos.add(productonew);
										
				id = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return productos.iterator();
	}
}
