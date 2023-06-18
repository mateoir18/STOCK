package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import objetos.Producto;

public class Write {

	private final static String FICHERO = "C:\\Users\\User\\Documents\\resultado.txt";

	public static void rellenarArchivo(Iterator<Producto> products) {

		BufferedWriter ficheroSalida;
		ArrayList<Producto> productosFinales = new ArrayList<Producto>();

		try {
			ficheroSalida = new BufferedWriter(new FileWriter(FICHERO));

			while (products.hasNext()) {
				productosFinales.add(products.next());
			}

			ficheroSalida.write(productosFinales.toString());

			ficheroSalida.close();
		} catch (Exception e) {
			System.out.println("No se pudo escribir nada");
			e.printStackTrace();
		}
	}
}
