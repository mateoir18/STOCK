package ayudas;

import ayudas.ComparadorProductos;
import errores.PrecioNoCoincideException;
import objetos.Producto;

public class ProductoCreator {

	public ProductoCreator() {
		
	}
	
	public static Producto ConstruirProducto(String id, String nombre, String cantidad, String precio) {
		
		Producto producto = new Producto(id, nombre, Integer.parseInt(cantidad),Double.parseDouble(precio));
		
		try {
			producto = ComparadorProductos.compararProductos(producto);
		} catch ( PrecioNoCoincideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return producto;
	}
	


}
