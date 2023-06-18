package datos;

import java.util.ArrayList;
import java.util.Iterator;
import objetos.Producto;

public class FicheroST1 {

	private ArrayList<Producto> productosFichero;
	private String fichero;

	public FicheroST1(String fichero) {

		productosFichero = new ArrayList<Producto>();
		this.fichero = fichero;

	}

	public String getFichero() {
		return fichero;
	}

	public void setFichero(String fichero) {
		this.fichero = fichero;
	}

	public void guardarDatos(Iterator<Producto> p) {

		while (p.hasNext()) {
			productosFichero.add(p.next());
		}
	}

	@Override
	public String toString() {
		return "Fichero [productosFichero=" + productosFichero + "]";
	}

}
